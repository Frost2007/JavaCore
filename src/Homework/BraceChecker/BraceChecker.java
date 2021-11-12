package Homework.BraceChecker;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack myStack = new Stack();
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[')
                myStack.push(chars[i]);
        }
        char c;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case ')':
                    c = (char) myStack.pop();
                    if (c == '{' || c == '[')
                        System.err.println(" Error: open " + c + " and closed " + chars[i] + " at " + (i + 1));
                    break;

                case '}':
                    c = (char) myStack.pop();
                    if (c == '(' || c == '[')
                        System.err.println(" Error: open " + c + " and closed " + chars[i] + " at " + (i + 1));
                    break;

                case ']':
                    c = (char) myStack.pop();
                    if (c == '(' || c == '{')
                        System.err.println(" Error: open " + c + " and closed " + chars[i] + " at " + (i + 1));

                    break;

            }
        }

        if (myStack.getSize() >= 0)
            System.err.println("Error : open brace  but don`t closed");
        else if (myStack.getSize() < 0)
            System.err.println("Error : don`t open brace  but  closed");
    }
}


