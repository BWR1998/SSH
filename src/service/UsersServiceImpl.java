package service;

import dao.UsersDAO;
import dao.UsersDAOImpl;
import entity.Users;

public class UsersServiceImpl implements UsersService{
	private  UsersDAO  usersDAO;
	@Override
	public Users usersLogin(Users users) {
		 
		return usersDAO.usersLogin(users);
	}
	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
}
