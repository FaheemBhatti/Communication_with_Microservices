package org.StoreApp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller
public class Controller {
	
    @GetMapping("/samsung")
    public String samsung(Model model) {
    	RestTemplate restTemplete = new RestTemplate();
		String result = restTemplete.getForObject("http://localhost:8081/devices", String.class);
        model.addAttribute("tasks", result);
        return "samsung"; //view
    }
    
    @GetMapping("/apple")
    public String apple(Model model) {
    	RestTemplate restTemplete = new RestTemplate();
		String result = restTemplete.getForObject("http://localhost:8082/devices", String.class);
        model.addAttribute("tasks", result);
        return "apple"; //view
    }
}