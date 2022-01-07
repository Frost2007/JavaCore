package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.model.User;
import homework.education.model.UserType;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.storage.UserStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();
    static boolean isRun1 = true;

    public static void main(String[] args) throws ParseException {
        initData();

        while (isRun1) {
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
                    isRun1 = false;

                default:
                    System.err.println("INVALID COMMAND");
            }
        }
    }

    private static void initData() {
        studentStorage.initData();
        lessonStorage.initData();
        userStorage.initData();
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
                if (user.getType().equals(UserType.ADMIN)) {
                    adminMenu();
                } else if (user.getType().equals(UserType.USER)) {
                    userMenu();
                }
            } else {
                System.err.println("invalid password");
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());

        }


    }

    public static void userMenu() throws ParseException {
        boolean isRun = true;
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
        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommandsAdmin();
            String commandAdmin = scanner.nextLine();
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
        } catch(NullPointerException e) {
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
                String type = scanner.nextLine();
                if (type.equalsIgnoreCase(UserType.USER.toString()) || type.equalsIgnoreCase(UserType.ADMIN.toString())) {
                    User newUser = new User(userName, userSurname, userEmail, password, UserType.valueOf(type));
                    userStorage.addUser(newUser);
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
        String lessonStr = scanner.nextLine();
        lessonStorage.deleteLesson(lessonStr);

    }

    private static void printStudentByLesson() {
        System.out.println("please input lesson");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            studentStorage.printByLesson(lesson);
        } else {
            System.err.println(" lesson with this name does not exist");
        }
    }


    private static void addLesson() {
        System.out.println("please input lessonName");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
            if (lesson == null) {
                System.out.println("Please input lesson duration");
                double duration = Double.parseDouble(scanner.nextLine());
                System.out.println("Please input lecturer name");
                String lecturer = scanner.nextLine();
                System.out.println("Please input price of lesson");
                int price = Integer.parseInt(scanner.nextLine());
                Lesson lessons = new Lesson(lessonName, duration, lecturer, price);
                lessonStorage.add(lessons);
                System.out.println("thank You , the lesson was added");
            }else System.out.println("Lesson already exists");
        }


        private static void printStudents () {
            studentStorage.print();
        }

        public static void addStudent () throws ParseException {
            System.out.println("please input name of lesson, or lessons if there is more than one ");
            String lessonStr = scanner.nextLine();
            String[] lessonNames = lessonStr.split(",");
            List<Lesson> lessons = new ArrayList<>();
            Lesson lesson;
            for (String lessonName : lessonNames) {
                if ((lesson = lessonStorage.getByLessonName(lessonName)) != null) {
                    lessons.add(lesson);
                }
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
        }
    }
