package homework.education;

import homework.education.exceptions.UserNotFoundException;
import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.DateUtil;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();
    static boolean isRun = true;

    public static void main(String[] args) throws ParseException {

        while (isRun) {
            LessonStudentCommands.printStartCommands();
            String startCommand = scanner.nextLine();
            switch (startCommand) {
                case LOGIN:
                    loginUser();
                    break;
                case REGISTER:
                    registerUser();
                    break;
                case EXIT:
                    isRun = false;

                default:
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void loginUser() throws ParseException {
        System.out.println("Enter Your email");
        String email = scanner.nextLine();
        try {
            User user = userStorage.getByEmail(email);
            System.out.println("Enter Your password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                System.out.println("You are in system");
                if (user.getType().equals("admin")) {
                    adminMenu();
                } else if (user.getType().equals("user")) {
                    userMenu();
                }
            } else {
                System.err.println("invalid password");
            }
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());

        }


    }

    public static void userMenu() throws ParseException {
        while (isRun) {
            LessonStudentCommands.printCommandsUser();
            String commandUser = scanner.nextLine();
            switch (commandUser) {
                case EXIT:
                    return;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.err.println("INVALID COMMAND");
                    break;
            }
        }
    }

    public static void adminMenu() throws ParseException {

        LessonStudentCommands.printCommandsAdmin();
        String commandAdmin = scanner.nextLine();
        while (isRun) {
            switch (commandAdmin) {
                case EXIT:
                    isRun = false;
                    return;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("INVALID COMMAND");
                    break;

            }
        }
    }

    private static void registerUser() {
        System.out.println("Enter your email");
        String userEmail = scanner.nextLine();
        try {
            userStorage.getByEmail(userEmail);
            System.out.println("User with this email already exists");
        } catch (UserNotFoundException e) {
            System.out.println("Please input your name");
            String userName = scanner.nextLine();
            System.out.println("input your surname");
            String userSurname = scanner.nextLine();
            System.out.println("Create password please");
            String password = scanner.nextLine();
            System.out.println("Which kind of user are you? ");
            System.out.println("admin or user");
            boolean isType = true;
            while (isType) {
                String typeOfUser = scanner.nextLine();
                if (typeOfUser.equals("admin") || typeOfUser.equals("user")) {
                    User user = new User(userName, userSurname, userEmail, password, typeOfUser);
                    userStorage.addUser(user);
                    System.out.println("Thank You, You are registered");
                    isType = false;
                } else {
                    System.err.println("please type only: admin or user ");

                }
            }
        }
    }


    private static void deleteStudentByEmail() {
        System.out.println("enter email of student");
        String email = scanner.nextLine();
        studentStorage.deleteByEmail(email);
    }

    private static void deleteLessonByName() {
        System.out.println("please input lesson name");
        String lesson = scanner.nextLine();
        if (lessonStorage.getByLessonName(lesson) != null) {
            lessonStorage.deleteLesson(lesson);
            System.out.println("the lesson has been deleted");
        } else
            System.out.println("this type of lesson dos not exist");

    }

    private static void printStudentByLesson() {
        System.out.println("please input lesson");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            studentStorage.printByLesson(lessonName);
        } else {
            System.err.println(" lesson with this name does not exist");
        }
    }


    private static void addLesson() {
        System.out.println("please input lessonName");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson duration");
        double duration = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input lecturer name");
        String lecturer = scanner.nextLine();
        System.out.println("Please input price of lesson");
        int price = Integer.parseInt(scanner.nextLine());
        Lesson lesson = new Lesson(lessonName, duration, lecturer, price);
        lessonStorage.add(lesson);
        System.out.println("thank You , the lesson was added");
    }

    private static void printStudents() {
        studentStorage.print();
    }

    public static void addStudent() throws ParseException {
        System.out.println("please input name of lesson, or lessons if there is more than one ");
        String lessonStr = scanner.nextLine();
        String[] lessonNames = lessonStr.split(",");
        int size = 0;
        for (String lessonName : lessonNames) {
            if (lessonStorage.getByLessonName(lessonName) != null)
                size++;
        }
        Lesson[] lessons = new Lesson[size];
        for (int i = 0; i < size; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
                lessons[i] = lessonStorage.getByLessonName(lessonNames[i]);

        }

        System.out.println("Please input student`s name");
        String name = scanner.nextLine();
        System.out.println("Please input student`s surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student`s age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student`s date of birth");
        String dateOfBirth = scanner.nextLine();
        Date date = DateUtil.stringToDate(dateOfBirth);
        System.out.println("Please input student`s email");
        String email = scanner.nextLine();
        System.out.println("Please input student`s phone");
        String phone = scanner.nextLine();

        Student student = new Student(name, surname, age, date, email, phone, lessons);
        studentStorage.add(student);
        System.out.println("Thank You, the student was added");

//        lessonStorage.add(new Lesson("java", 3, "karen", 35000));
//        lessonStorage.add(new Lesson("python", 2, "gevorg", 20000));
//        lessonStorage.add(new Lesson("javascript", 2.5, "aghas", 25000));
//
//        Lesson[] lesson = new Lesson[3];
//        lesson[0] = lessonStorage.getByLessonName("java");
//        lesson[1] = lessonStorage.getByLessonName("python");
//        lesson[2] = lessonStorage.getByLessonName("javascript");
//
//        userStorage.addUser(new User("Hovhannes","Avetisyan","vip.psn2007@mail.ru","0606","admin"));
//        studentStorage.add(new Student("hovhannes", "avetisyan", 40,
//                DateUtil.stringToDate("06/06/1981"), "hovo@mail.com", "098979617", lesson));
//        new Lesson("javascript", 2.5, "aghas", 25000);

    }
}
