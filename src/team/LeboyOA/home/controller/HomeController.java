package team.LeboyOA.home.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import team.LeboyOA.common.pojos.CommonData;
import team.LeboyOA.common.pojos.Manager;

@Controller
@RequestMapping("home/")
public class HomeController {
	
	@Autowired
	private HttpServletRequest request;
	
	//初始化接口
	@RequestMapping("welcome.php")
	public String welcome() {
		return "redirect:/home/login.php";
	}
	
	//登录跳转
	
	@RequestMapping("login.php")
	public String login() {	
		if(request.getSession().getAttribute(CommonData.loginUser) == null){
			return "login";
		}else{
			//Manager manager = (Manager) request.getSession().getAttribute(CommonData.loginUser);
			//String parentId = manager.getBelong_dep_uuid();
			return "welcome";
		}
	}
	
	@ResponseBody
	@RequestMapping("goLogin.php")
	public HashMap<String, Object> goLogin() {
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("msg", "good");
		return hashMap;
	}

}
