package kr.co.jhta.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	JdbcUserDetailsManager judm;
	BCryptPasswordEncoder pe;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/common/login")
	public void login(String error, String logout, Model model) {
		
		if(error != null)
			model.addAttribute("error", "log : error");
		else if(logout != null)
			model.addAttribute("logout", "log : logout");
	}
	
	@RequestMapping(value="/common/logout")
	public void logoutGet() {
		logger.info("logout");
	}
}
