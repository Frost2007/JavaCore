package Homework.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker bracechecker = new BraceChecker("Hello (from) [Java}");


        bracechecker.check();
       // System.out.println("Error: opened [ but closed } at 20");

    }


}


