package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("访问了LoginController");
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		if("王胖子".equals(userName)&&"tom".equals(passWord)){
			return new ModelAndView("ok");
		}else
			return new ModelAndView("login");
	}
}
