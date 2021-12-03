package homework.education;

import homework.education.model.Lesson;
import homework.education.model.Student;
import homework.education.storage.LessonStorage;
import homework.education.storage.StudentStorage;
import homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();


    public static void main(String[] args) throws ParseException {
        lessonStorage.add(new Lesson("java", 3, "karen", 35000));
        lessonStorage.add(new Lesson("python", 2, "gevorg", 20000));
        lessonStorage.add(new Lesson("javascript", 2.5, "aghas", 25000));

        Lesson[] lesson = new Lesson[2];
        lesson[0] = lessonStorage.getByLessonName("java");
        lesson[1] = lessonStorage.getByLessonName("python");
        studentStorage.add(new Student("hovhannes", "avetisyan", 40, DateUtil.stringToDate("06/06/1981"),"hovo@mail.com", "098979617", lesson));
        //     studentStorage.add(new Student("ben", "khachatryan", 30, "ben@mail.com", "094556677", new Lesson("java", 3, "karen", 35000)));
        //    studentStorage.add(new Student("poxos", "poxosyan", 20, "poxos@mail.com", "055310712", new Lesson("python", 2, "gevorg", 20000)));
        //  studentStorage.add(new Student("petros", "petrosyan", 25, "petros@mail.com", "044150712", new Lesson("javascript", 2.5, "aghas", 25000)));

        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
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
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;

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


    private static void printLessons() {
        lessonStorage.print();
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

    private static void addStudent() throws ParseException {
        System.out.println("please input name of lesson, or lessons if there is more than one ");
        String lessonStr = scanner.nextLine();
        String[] lessonNames = lessonStr.split(",");
        int size = 0;
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
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
    }
}
