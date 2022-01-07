package homework.author.storage;

import homework.author.model.User;
import homework.author.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> userMap = new HashMap<>();

    public void add(String email,User user) {
        userMap.put(email, user);
        FileUtil.serializeUserMap(userMap);
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    //TODO add implementation later.
    public User getByEmailAndPassword(String email, String password) {
        return null;
    }


    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();

            userMap = userMapFromFile;

    }
}