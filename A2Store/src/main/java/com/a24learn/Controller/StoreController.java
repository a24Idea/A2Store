package com.a24learn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.a24learn.model.Devices;

@Controller
public class StoreController {
	
	private Devices result;
    private ModelAndView modelAndView;
    
    @Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping ("/")
	public String home() {
		return "home";
	}
	
	
	
	@RequestMapping ("{brandName}")
	public ModelAndView samsung(@PathVariable("brandName") String brandName) {
	modelAndView = new ModelAndView("viewDevices");
	switch(brandName.toLowerCase()) {
	case "nokia":
		//modelAndView=new ModelAndView("nokia");
		//restTemplate = new RestTemplate();
		result=restTemplate.getForObject ("http://NORWAY/nokia/devices", Devices.class);
		modelAndView.addObject("devices", result);
		return modelAndView;
		
	case "apple":
		//modelAndView=new ModelAndView("nokia");
		//restTemplate = new RestTemplate();
		result=restTemplate.getForObject ("http://localhost:8083/apple/devices", Devices.class);
		modelAndView.addObject("devices", result);
		return modelAndView;
	/*case "nokia":
		//modelandview=new ModelAndView("nokia");
		restTemplate = new RestTemplate();
		result=restTemplate.getForObject ("http://localhost:8084/nokia/devices", Devices.class);
		modelAndView.addObject("devices", result);
		return modelAndView;*/
	default:
		
		return new ModelAndView("redirect: /error");
	}
}
	
	/*@RequestMapping("/error") 
	public ModelAndView error() {
		ModelAndView modelAndView = new ModelAndView("error");
		return modelAndView;
	}*/
	

}
