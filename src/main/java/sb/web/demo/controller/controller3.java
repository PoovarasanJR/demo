package sb.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sb.web.demo.service.service2;

@RestController
@RequestMapping(value="/control3")
public class controller3 {
	
	@Autowired
	private service2 service2;
	
	@GetMapping("/test")
	public String test(){
		return "This page is working";
	}
	
	@GetMapping("/anotherservice")
	public String sample(){
		return service2.callAnotherService();
	}
}
