package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.User;
import Service.UserService;
import Service.UserServiceImpl;

/**
 * Servlet implementation class login
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceImpl userService=null;
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected int processRegister(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    	userService=new UserService();
    	String name=request.getParameter("email");
    	String pass=request.getParameter("password");
    	User user=new User(name,pass);
    	boolean status=userService.insertUser(user);
    	if(status) return 1;
    	return 0;
    }
    protected int processLogin(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    	userService=new UserService();
    	String name=request.getParameter("email");
    	String pass=request.getParameter("password");
    	User user=new User(name,pass);
    	if(userService.userLogin(user)==1){
    	   HttpSession session=request.getSession(true);
    	   session.setAttribute("user",name);
           return 1;
    	}
    	return 0;
    }
    protected int logOut(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      HttpSession session=request.getSession();
      session.invalidate();
       return 1;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(processLogin(request, response));
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    if("logOut".equals(request.getParameter("type"))){
	      response.getWriter().print(logOut(request, response));
	    }
	    else response.getWriter().print(processRegister(request, response));
		
	}
	

}
