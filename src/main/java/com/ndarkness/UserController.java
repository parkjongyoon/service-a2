package com.ndarkness;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("getUserName")
	public Map<String,String> getUserName(){
		
		System.out.println("getUserName2 called");
		
		HashMap<String,String> response = new HashMap<>();
		response.put("result","200");
		response.put("msg","ok");
		response.put("username", "park");
		
		return response;
	}
}
