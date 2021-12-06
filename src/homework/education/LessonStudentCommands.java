package homework.education;

public interface LessonStudentCommands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";
    String ADD_LESSON = "3";
    String ADD_STUDENT = "4";
    String PRINT_STUDENTS = "5";
    String PRINT_STUDENTS_BY_LESSON = "6";
    String PRINT_LESSONS = "7";
    String DELETE_LESSON_BY_NAME = "8";
    String DELETE_STUDENT_BY_EMAIL = "9";

   static  void printStartCommands(){
       System.out.println("Please input "+LOGIN+" for LOG IN");
       System.out.println("Please input "+REGISTER+" for REGISTER ");
       System.out.println("Please input " + EXIT + " for EXIT");


   };


    static void printCommandsAdmin() {
        System.out.println("\u001B[34m" +"Please input " + EXIT + " for return to main menu");
        System.out.println("Please input " + ADD_LESSON + "for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL" + "\u001B[0m");
    }

    static void printCommandsUser() {
        System.out.println("\u001B[34m" +"Please input " + EXIT + " for  return to main menu");
        System.out.println("Please input " + ADD_LESSON + "for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS" + "\u001B[0m");
    }

}
