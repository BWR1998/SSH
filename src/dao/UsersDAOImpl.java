package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import entity.Users;

@Transactional
public class UsersDAOImpl extends BaseDAO implements UsersDAO{

	@Override
	public Users usersLogin(Users users) {
		 Session  session = getSession();
		
		 Query query=session.createQuery(" from Users where users_id=? and users_tel=?");
		 query.setString(0,users.getUsers_id());
		 query.setString(1, users.getUsers_tel());
		 List<Users> list=query.list();
		 //session.close();
		 if(list.size() == 0)
		 {
			 return null;
		 }else{
			 return list.get(0);
		 }
		
	}

}
