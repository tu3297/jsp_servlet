package Service;

import Entity.User;

public interface UserServiceImpl {
    boolean insertUser(User user);
    int userLogin(User user);
    int checkUsername(String userName);
}
