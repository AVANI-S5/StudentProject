package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String showPage()
	{
		System.out.println("Successful");
		return "contact";
		
	}
//	@RequestMapping(path="/contactform", method = RequestMethod.POST)
//	public String GetContact(@RequestParam("id") String  studId,@RequestParam("name") String studName,@RequestParam("age") String studAge,@RequestParam("gender") String studGender,@RequestParam("phno") String studPhno,Model model)
//	{
//		System.out.println(studId);
//		System.out.println(studName);
//		System.out.println(studAge);
//		System.out.println(studGender);
//		System.out.println(studPhno);
//		model.addAttribute("id",studId);
//		model.addAttribute("name",studName);
//		model.addAttribute("age",studAge);
//		model.addAttribute("gender",studGender);
//		model.addAttribute("phno",studPhno);
//		
//		return "final";
//		
//	}
//	@RequestMapping(path="/contactform", method = RequestMethod.POST)
//	public String GetContact(@ModelAttribute Student student,Model model)
//	{ 
//		model.addAttribute("Header","Learning Spring MVC");
//		model.addAttribute("desc","Learning how to send the data");
//	  
//		return "final";
//	}
	
	@RequestMapping(path="/contactform", method = RequestMethod.POST)
	public String GetContact(@RequestParam("id") String  studId,@RequestParam("name") String studName,@RequestParam("age") String studAge,@RequestParam("gender") String studGender,@RequestParam("phno") String studPhno,Model model)
	{
		Student student=new Student();
		student.setId(studId);
		student.setName(studName);
		student.setAge(studAge);
		student.setGender(studGender);
		student.setPhno(studPhno);
		model.addAttribute("student",student);
		return "final";
		
		
	}
	


}
