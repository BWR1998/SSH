package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class SupperAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{
	public ServletContext context;
	public HttpServletResponse response;
	public HttpServletRequest request;
	public HttpSession session;
	@Override
	public void setServletContext(ServletContext context) {
		this.context=context;
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		this.session = request.getSession();
	}


}
