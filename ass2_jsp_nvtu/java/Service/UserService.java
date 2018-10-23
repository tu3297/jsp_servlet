package Service;

import Dao.UserDao;
import Dao.UserDaoImpl;
import Entity.User;

public class UserService implements UserServiceImpl {
	private UserDaoImpl user;
	@Override
	public boolean insertUser(User users) {
		// TODO Auto-generated method stub
		user=new UserDao();
		return user.insertUser(users);
	}
	@Override
	public int userLogin(User users) {
		// TODO Auto-generated method stub
		user=new UserDao();
		return user.userLogin(users);
	}
	@Override
	public int checkUsername(String userName) {
		user=new UserDao();
		return user.checkUserName(userName);
	}
}
