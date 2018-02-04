package team.LeboyOA.common.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import team.LeboyOA.common.handle.Parameter;
import team.LeboyOA.common.pojos.CommonData;
import team.LeboyOA.common.pojos.Manager;
//import team.LeboyOA.accessChain.service.LogService;

public class HandlerException implements HandlerExceptionResolver{

	//@Autowired
	//private LogService logService;
	
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, 
			Object obj, Exception e) {
		ModelAndView mv = new ModelAndView();
		response.setStatus(HttpStatus.OK.value()); 						//设置状态码  
		response.setContentType(MediaType.APPLICATION_JSON_VALUE); 		//设置ContentType  
		response.setCharacterEncoding("UTF-8"); 						//避免乱码  
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		try {
			response.getWriter().write("{\"msg\":\"error\"}");
			Parameter parameter = new Parameter();
			parameter.setPara(new HashMap<String, String>());
			if (request.getSession().getAttribute(CommonData.loginUser) != null) {
				parameter.getPara().put("exception_visitor", "1");
				parameter.getPara().put("exception_user_id", 
						((Manager)request.getSession().getAttribute(CommonData.loginUser)).getId() + "");
			} else {
				parameter.getPara().put("exception_visitor", "2");
			}
			StringBuffer _para = new StringBuffer();
			for(Map.Entry<String, String[]> _entry : request.getParameterMap().entrySet()){
				_para.append("[").append(_entry.getKey()).append(":");
				for (int i = 0; i < _entry.getValue().length; i++) {
					_para.append(_entry.getValue()[i]);
				}
				_para.append("]");
			}
			parameter.getPara().put("exception_description", _para.toString());
			parameter.getPara().put("exception_origin", request.getServletPath());
			parameter.getPara().put("exception_type", e.getClass().getName());
			parameter.getPara().put("create_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
			//logService.addExceptionLog(parameter);
			System.gc();
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return mv;  
	}

}
