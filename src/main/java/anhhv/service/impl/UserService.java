package anhhv.service.impl;

import anhhv.models.UserModel;
import anhhv.service.IUserService;
import anhhv.dao.IUserDao;
import anhhv.dao.Impl.UserDaoImpl;

public class UserService implements IUserService {

	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassWord())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel FindByUserName(String username) {
		return userDao.findByUserName(username);
	}

}
