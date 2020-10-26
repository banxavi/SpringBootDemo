package banxavi.SpringLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import banxavi.SpringLogin.form.LoginForm;

@Controller
public class LoginController {
	
	// Get login form page 
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() {
		// Return Login page
		return "login";
	}
	//checking for login
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model)
	{
		 String username = loginForm.getUsername();
		 String password = loginForm.getPassword();
		 // If username && password is correct then login home
		 if("admin".equals(username) && "admin".equals(password))
		 {
			 return "home";
		 }
		 model.addAttribute("False username or password",true);
		 // return again login;
		 return "login";
	}

}
