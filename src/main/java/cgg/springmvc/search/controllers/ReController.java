package cgg.springmvc.search.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is first handler");
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl("https://www.google.com"); 
		
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is second handler");
		return "contact";
	}

}
