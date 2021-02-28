package action;

import com.opensymphony.xwork2.ModelDriven;

import entity.Users;

import service.UsersService;
import service.UsersServiceImpl;

public class UsersAction extends SupperAction implements ModelDriven<Users>{
	public Users users = new Users();
	private UsersService usersService;
	public String login(){
		Users u =usersService.usersLogin(users);
		if(u == null){
			request.setAttribute("message", "用户名或密码错误");
			return "login_failure";
		}else{
			session.setAttribute("loginUserName", u.getUsers_name());
			return "login_success";
		}
	}
		public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
		public String logout(){
			session.removeAttribute("loginUserName");
			return "login_failure";
	}

	@Override
	public Users getModel() {
		return users;
	}
}
