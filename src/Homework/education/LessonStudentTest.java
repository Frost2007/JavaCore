package Homework.education;

import java.util.Scanner;

public class LessonStudentTest {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL" + "\u001B[0m");
    }


    public static void main(String[] args) {
        lessonStorage.add(new Lesson("java", 3, "karen", 35000));
        lessonStorage.add(new Lesson("python", 2, "gevorg", 20000));
        lessonStorage.add(new Lesson("javascript", 2.5, "aghas", 25000));

        studentStorage.add(new Student("hovhnnes", "avetisyan", 40, "hovo@mail.com", "098979617", "java"));
        studentStorage.add(new Student("ben", "khachatryan", 30, "ben@mail.com", "094556677", "java"));
        studentStorage.add(new Student("poxos", "poxosyan", 20, "poxos@mail.com", "055310712", "javascript"));
        studentStorage.add(new Student("petros", "petrosyan", 25, "petros@mail.com", "044150712", "python"));

        boolean isRun = true;
        while (isRun) {
            printCommands();
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
        lessonStorage.deleteLesson(lesson);
    }

    private static void printStudentByLesson() {
        System.out.println("please input lesson");
        String lesson = scanner.nextLine();
        if (lesson != null) {
            studentStorage.printByLesson(lesson);
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

    private static void addStudent() {
        System.out.println("Please input  lesson");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            System.out.println("Please input student`s name");
            String name = scanner.nextLine();
            System.out.println("Please input student`s surname");
            String surname = scanner.nextLine();
            System.out.println("Please input student`s age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input student`s email");
            String email = scanner.nextLine();
            System.out.println("Please input student`s phone");
            String phone = scanner.nextLine();

            Student student = new Student(name, surname, age, email, phone, lessonName);
            studentStorage.add(student);
            System.out.println("Thank You, the student was added");
        }
    }
}