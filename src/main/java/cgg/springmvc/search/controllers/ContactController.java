package cgg.springmvc.search.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cgg.springmvc.search.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learning Spring MVC");
		m.addAttribute("Desc","Home for Programmers");
		System.out.println("Adding Common Data");
		
	}
	@RequestMapping("/contacts")
	public String showForm() {
		System.out.println("creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
	
//		User user = new User();
//		
//		user.setEmail(email);
//		user.setUserName(userName);
//		user.setPassword(password);
		
		System.out.println(user);
		

		//		model.addAttribute("user",user);
		
//		System.out.println("user email "+email);
//		System.out.println("user name "+userName);
//		System.out.println("user password "+password);
//		
		//process...
		
//		model.addAttribute("email",email);
//		model.addAttribute("name",userName);
//		model.addAttribute("password",password);
		if(user.getUserName().isBlank()) {
			return "redirect:/contacts";
		}
		return "success";
		
	}

}
