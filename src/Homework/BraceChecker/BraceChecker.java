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
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                myStack.push(chars[i]);
            }
        }
        boolean b;
        for (int i = chars.length - 1; i >= 0; i--) {

            if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']')
                myStack.pop();

            switch (chars[i]) {
                case ')':
                    if (myStack.pop() == '(') {
                        b = true;
                    }
                    break;
                case '}':
                    if (myStack.pop() == '{') {
                        b = true;
                    }
                    break;
                case ']':
                    if (myStack.pop() == '[') {
                        b = true;
                    }
                    break;
                default:
                    b = false;
            }
        }
    }
}

