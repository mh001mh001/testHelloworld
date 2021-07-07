package cn.jbit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/sayHi")
	public String sayHi() {
		System.out.println("hello lxm!!");
		System.out.println(1);
		return "index";
	}
}
