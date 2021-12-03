package lesson16.variablesInInterfaces;

public class AskMe implements SharedConstants{
    static void answer (int result){
        switch (result){
            case NO:
                System.out.println("no");
                break;
            case YES:
                System.out.println("yes");
                break;
            case LATER:
                System.out.println("some later");
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
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
