package homework.education.exeptions;

public class UserNotFoundException extends NullPointerException{
    public UserNotFoundException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "UserNotFound{}";
    }
}
