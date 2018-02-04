package team.LeboyOA.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home/")
public class HomeController {
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("welcome.php")
	public String welcome() {
		return "redirect:/index.html";
	}

}
