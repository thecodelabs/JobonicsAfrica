package com.example.jobonics.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.jobonics.model.NewJobs;
import com.example.jobonics.service.NewJobsService;



@Controller

public class NewJobsController {
	
	@Autowired
	private NewJobsService NJS;
	
	@RequestMapping(value="/newjob",method=RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		NewJobs newJobs = new NewJobs();
		model.addAttribute("newjobs",newJobs);
		return "new_job";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRegistration(@Valid NewJobs newJobs,BindingResult result,ModelMap model,RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			System.out.println("has errors");
			return "new_job";
		}
	
		NJS.save(newJobs);
		
		return "redirect:/viewjobos";
	}
	
	
	@RequestMapping(value="/viewjobos")
	public ModelAndView getAll() {
		
		List<NewJobs> list=NJS.findAll();
		return new ModelAndView("viewjobos","list",list);
	}
		

}