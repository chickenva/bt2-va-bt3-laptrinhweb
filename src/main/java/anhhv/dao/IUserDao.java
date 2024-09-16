package anhhv.dao;

import java.util.List;

import anhhv.models.UserModel;

public interface IUserDao {
	List<UserModel>findAll();
	UserModel findByID(int ID);
	void insert(UserModel user);
	UserModel findByUserName(String username);
}
