package springmvcexample.nyota.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@RequestMapping(value = "/")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring MVC";
	}
}
