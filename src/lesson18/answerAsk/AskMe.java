package lesson18.answerAsk;

import lesson18.answerAsk.Answers;
import lesson18.answerAsk.Questions;

public class AskMe {
    static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("no");
                break;
            case YES:
                System.out.println("yes");
                break;
            case MAYBE:
                System.out.println("maybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {
        Questions q = new Questions();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
