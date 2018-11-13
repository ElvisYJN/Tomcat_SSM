package com.xinhuanet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinhuanet.model.Login;
import com.xinhuanet.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "getLogin")
	@ResponseBody
	public Login getLogin(Long id) {
		Login login = loginService.getLogin(id);
		return login;
	}

}
