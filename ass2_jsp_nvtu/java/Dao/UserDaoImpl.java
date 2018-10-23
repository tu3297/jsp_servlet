package Dao;

import Entity.User;

public interface UserDaoImpl {
     boolean insertUser(User user);
     int userLogin(User user);
     int checkUserName(String userName);
}
