package com.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.model.ConfigProject;
@RestController
public class MyController {
	
	@Autowired
	ConfigProject configProject;
	
	@RequestMapping("/ust/projectDetails")
	public String displayProperties() {
		return "Project Id :"+configProject.getProjectId()+"Project Name :"+configProject.getProjectName()+"Project Location :" +"Project Cost :"+configProject.getProjectCost()+"Project Status :"+configProject.getProjectStatus();
	}
	
}
