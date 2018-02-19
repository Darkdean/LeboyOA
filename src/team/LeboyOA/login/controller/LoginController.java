package team.LeboyOA.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping("/login.php")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/userLogin.php")
	@ResponseBody
	public String userLogin() {
		
		return "";
	}

}





