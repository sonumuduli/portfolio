package in.portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/","","/home"})
	public String showHomePge(Model model)
	{
		model.addAttribute("tittle", "home");
	    return "master";	
	}
	@GetMapping("/projects")
	public String showhProjectpage(Model model)
	{ 
		model.addAttribute("tittle", "projects");
	    return "master";	
	}
	@GetMapping("/resume")
	public String showResumePge(Model model)
	{
		model.addAttribute("tittle", "resume");
	    return "master";	
	}
	@GetMapping("/contact")
	public String showContactPage(Model model)
	{
		model.addAttribute("tittle", "contact");
	    return "master";
	}
	    
	  @GetMapping("/response")
    public String showResponsePage(Model model)
    {
	  model.addAttribute("tittle", "response");
      return "response";	
	}

}
