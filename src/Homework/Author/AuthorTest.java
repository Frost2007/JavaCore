package Homework.Author;


import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        AuthorStorage as = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many authors do you have?");
        int numOfAuthors = scanner.nextInt();
        for (int i = 0; i < numOfAuthors; i++) {
            System.out.println("Please enter name of author");
            String name = scanner.next();
            System.out.println("Please enter surname of author");
            String surname = scanner.next();
            System.out.println("Please enter e-mail of author");
            String email = scanner.next();
            System.out.println("Please enter age of author");
            int age = scanner.nextInt();
            System.out.println("please enter gender of author (M or F)");
            String gender = scanner.next();


            Author author = new Author(name, surname, email, age, gender);
           as.add(author);
           as.getByIndex(i);


        }
        as.print();

    }
}
