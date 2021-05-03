package com.onlinebankingsystem.onlinebankingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebankingsystem.onlinebankingsystem.models.Account;
import com.onlinebankingsystem.onlinebankingsystem.models.BankTeller;
import com.onlinebankingsystem.onlinebankingsystem.models.Branch;
import com.onlinebankingsystem.onlinebankingsystem.models.User;

import com.onlinebankingsystem.onlinebankingsystem.repositories.IAccountRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IBankTellerRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IBranchRepository;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IUserRepository;

import java.util.List;

@RestController
public class BankTellerController {
  	@Autowired
    private IBankTellerRepository bankTellerRepository;
  	
  	@Autowired
  	private IUserRepository userRepository;
  	
  	@Autowired 
  	private IBranchRepository branchRepository;
  	
  	@Autowired
  	private IAccountRepository accountRepository;
  	
  	 public BankTellerController(IBankTellerRepository BankTellerRepository,
  			 IUserRepository UserRepository, 
  			 IBranchRepository BranchRepository,
  			 IAccountRepository AccountRepository)
     {
            bankTellerRepository = BankTellerRepository;
            userRepository = UserRepository;
            branchRepository = BranchRepository;
            accountRepository = AccountRepository;
     }

  	//Get All Bank Tellers
    @GetMapping("/banktellers")
    public List<BankTeller> getAllBankTeller(){
        return bankTellerRepository.findAll();
        
    }
    //Get Bank Teller By Id
    @GetMapping("/banktellers/{id}")
    public BankTeller getBankTellerById(@PathVariable Integer id ){
        return bankTellerRepository.getOne(id);
    }
    
    //Get All Users
    @GetMapping("/banktellers/allUser")
    public List<User> getAllUser(){
    	return userRepository.findAll();
    } 
    
    // Get All Branchs
    @GetMapping("/banktellers/allBranch")
    public List<Branch> getAllBranch(){
    	return branchRepository.findAll();
    }
    
    //Get All Account
    @GetMapping("/banktellers/allAccount")
    public List<Account> getAllAccount(){
    	return accountRepository.findAll();
    } 
}
