package homework.education.storage;

import homework.education.model.User;

public class UserStorage {


    private User[] users = new User[10];
    private int size;


    public void addUser(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length * 2];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public void printUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }

    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email))
                return users[i];
        }
        return null;
    }

    public User getByType(String type) {
        for (int i = 0; i < size; i++) {
            if(users[i].getType().equals(type));
            return users[i];

        }
        return null;
    }

    public User getBYPassword(String password) {
        for (int i = 0; i <size ; i++) {
           if (users[i].getPassword().equals(password))
               return users[i];
        }return null;
    }
}