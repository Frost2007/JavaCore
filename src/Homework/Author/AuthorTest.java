package Homework.Author;


import java.util.Scanner;

public class AuthorTest {
    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHOR = "2";
    private static final String SEARCH_AUTHOR_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";
    private static final String ADD_BOOK = "5";
    private static final String PRINT_BOOK = "6";
    private static final String SEARCH_BOOKS_BY_TITLE = "7";


    public static void main(String[] args) {
        bookStorage.add(new Book("War and peace", "war", 2500, 5));
        authorStorage.add(new Author("lev", "tolstoy", "lt@mail.com", 160, "male"));
        authorStorage.add(new Author("harriet", "stone", "hrry@mail.com", 80, "female"));
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOK:
                    bookStorage.printBook();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

        authorStorage.print();
        bookStorage.print();
    }


    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_AGE + " for SEARCH_AUTHOR_BY_AGE ");
        System.out.println("Please input " + PRINT_AUTHORS + " for PRINT AUTHORS");
        System.out.println("Please input " + ADD_BOOK + "for ADD_BOOK");
        System.out.println("Please input " + PRINT_BOOK + "for PRINT_BOOK");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + "for SEARCH_BOOKS_BY_TITLE");
    }

    private static void searchAuthorByAge() {
        System.out.println("please input minimum age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input maximum age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }


    private static void searchAuthor() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);
    }

    private static void addAuthor() {
        System.out.println("Please enter name of author");
        String name = scanner.nextLine();
        System.out.println("Please enter surname of author");
        String surname = scanner.nextLine();
        System.out.println("Please enter e-mail of author");
        String email = scanner.nextLine();
        System.out.println("Please enter age of author");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please enter gender of author (Male or Female)");
        String gender = scanner.next();

        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);
        System.out.println("Thank You! Author was added.");
    }

    private static void addBook() {
        System.out.println("please enter title of book");
        String title = scanner.nextLine();
        System.out.println("Please enter description of book");
        String description = scanner.nextLine();
        System.out.println("Please enter price of book");
        double price = scanner.nextDouble();
        System.out.println("Please insert count of books");
        int count = scanner.nextInt();

        Book book = new Book(title, description, price, count);
        bookStorage.add(book);
        System.out.println("Thank You! Book was added");
    }

    private static void searchBooksByTitle() {
        System.out.println("Please insert keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBooksByTitle(keyword);
    }
}
