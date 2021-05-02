package com.onlinebankingsystem.onlinebankingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebankingsystem.onlinebankingsystem.models.Admin;
import java.util.List;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IAdminRepository;


@RestController
public class AdminController {
	
	  	@Autowired
	    private IAdminRepository adminRepository;
	  	
	  	 public AdminController(IAdminRepository AdminRepository)
	     {
	            adminRepository = AdminRepository;
	     }

	    @GetMapping("/admins")
	    public List<Admin> All(){
	        var admins = adminRepository.findAll();
	        return admins;
	    }

	    @GetMapping("/admins/{id}")
	    public Admin get(@PathVariable Integer id ){
	        return adminRepository.getOne(id);
	    }
}
