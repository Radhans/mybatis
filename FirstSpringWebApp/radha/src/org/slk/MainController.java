package src.org.slk;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import src.org.slk.model.User;
@Controller

public class MainController {
	
	/*@RequestMapping(value = "/", method = RequestMethod.GET )
	public String welcome() {
		return "hello";
	}*/
/*@RequestMapping("displayname")
public String displayName(HttpServletRequest request) {
	String firstName = request.getParameter("firstName");
	request.setAttribute("firstName", firstName);
	return "display";
}*/
	
/*@RequestMapping("displayname")
public ModelAndView display(@RequestParam("firstName") String firstName) {
	ModelAndView modelAndView = new ModelAndView("display");
	Date date = new Date();
	List<String> names = new ArrayList<>();
	names.add("shaziya");
	names.add("Radha");
	names.add("Ranjitha");
	names.add("kavya");
	
	modelAndView.addObject("date",date);
	modelAndView.addObject("name",firstNamMainController.javae);
	modelAndView.addObject("team",names);
	return modelAndView;
	
}*/
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		modelAndView.addObject("user",user);
		return modelAndView;
		
	}
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayuserInfo");
		System.out.println(user);
		modelAndView.addObject("user",user);
		return modelAndView;
		
	}
 }
