package com.onlinebankingsystem.onlinebankingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebankingsystem.onlinebankingsystem.models.Account;
import com.onlinebankingsystem.onlinebankingsystem.models.Admin;
import com.onlinebankingsystem.onlinebankingsystem.models.BankTeller;
import com.onlinebankingsystem.onlinebankingsystem.models.Branch;
import com.onlinebankingsystem.onlinebankingsystem.models.User;

import java.util.List;

import com.onlinebankingsystem.onlinebankingsystem.repositories.IAccountRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IAdminRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IBankTellerRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IBranchRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IUserRepository;


@RestController
public class AdminController {
	
	  	@Autowired
	    private IAdminRepository adminRepository;
	  	
	  	@Autowired
	  	private IUserRepository userRepository;
	  	
	  	@Autowired
	  	private IBankTellerRepository bankTellerRepository;
	  	
	  	@Autowired 
	  	private IBranchRepository branchRepository;
	  	
	  	@Autowired
	  	private IAccountRepository accountRepository;
	  	
	  	 public AdminController(IAdminRepository AdminRepository, 
	  			 IUserRepository UserRepository, 
	  			 IBankTellerRepository BankTellerRepository,
	  			 IBranchRepository BranchRepository,
	  			 IAccountRepository AccountRepository)
	     {
	            adminRepository = AdminRepository;
	            userRepository = UserRepository;
	            bankTellerRepository = BankTellerRepository;
	            branchRepository = BranchRepository;
	            accountRepository = AccountRepository;
	     }

	  	//Get All Admins
	    @GetMapping("/admins")
	    public List<Admin> getAllAdmins(){
	        var admins = adminRepository.findAll();
	        return admins;
	    }
	    
	    //Get Admin By Id
	    @GetMapping("/admins/{id}")
	    public Admin getAdminById(@PathVariable Integer id) {	      
	      return adminRepository.getOne(id); 
	    }
	    
	    //Get All Users
	    @GetMapping("/admins/allUser")
	    public List<User> getAllUser(){
	    	return userRepository.findAll();
	    } 
	    
	    //Get User By Id
	    @GetMapping("/admins/allUser/{id}")
	    public User getUserById(@PathVariable Integer Id) {
	      return userRepository.getOne(Id); 
	    }
	    
	    // Get All Bank Tellers
	    @GetMapping("/admins/allBankTeller")
	    public List<BankTeller> getAllBankTeller(){
	    	return bankTellerRepository.findAll();
	    }
	    
	    // Get Bank Teller By Id 
	    @GetMapping("/admins/allBankTeller/{id}")
	    public BankTeller getBankTellerById(@PathVariable Integer id) {
	      return bankTellerRepository.getOne(id); 
	    }
	    
	    // Get All Branchs
	    @GetMapping("/admins/allBranch")
	    public List<Branch> getAllBranch(){
	    	return branchRepository.findAll();
	    }
	    
	    //Create User
	    @PostMapping("/admins/users")
	    public User createUser(@RequestBody User newUser) {
	      return userRepository.save(newUser);
	    }
	    
	    //Delete User
	    @DeleteMapping("/admins/users/{id}")
	    void deleteEmployee(@PathVariable Integer id) {
	      userRepository.deleteById(id);
	    }
	    
	    //Update User
	    @PutMapping("/admins/users/{id}")
	    public User updateUser(@RequestBody User newUser, @PathVariable Integer id) {  
	    	 return userRepository.findById(id)
	    		      .map(user -> {
	    		        user.setUserName(newUser.getUserName());
	    		        user.setUserSurname(newUser.getUserSurname());
	    		        user.setUserIdentityNo(newUser.getUserIdentityNo());
	    		        return userRepository.save(user);
	    		      })
	    		      .orElseGet(() -> {
	    		    	  newUser.setUserId(id);
	    		    	  return userRepository.save(newUser);
	    		      }); 		   
	    }
	    
	    //Get All Account
	    @GetMapping("/admins/allAccount")
	    public List<Account> getAllAccount(){
	    	return accountRepository.findAll();
	    } 
}
