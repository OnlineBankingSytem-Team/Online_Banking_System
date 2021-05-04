package com.onlinebankingsystem.onlinebankingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebankingsystem.onlinebankingsystem.services.AdminService;


@RestController
public class AdminController {
	
	  @Autowired
	  private AdminService adminService;	
	  	
	  @GetMapping("/admins")
	  public String getAllAdmins(Model model) {
		  model.addAttribute("allAdmins", adminService.getAllAdmins());
		  return "alladmins";
	  }
	  	
}
