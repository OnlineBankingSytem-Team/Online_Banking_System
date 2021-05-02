package com.onlinebankingsystem.onlinebankingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebankingsystem.onlinebankingsystem.models.BankTeller;
import com.onlinebankingsystem.onlinebankingsystem.repositories.IBankTellerRepository;

import java.util.List;

@RestController
public class BankTellerController {
  	@Autowired
    private IBankTellerRepository bankTellerRepository;
  	
  	 public BankTellerController(IBankTellerRepository BankTellerRepository)
     {
            bankTellerRepository = BankTellerRepository;
     }

    @GetMapping("/banktellers")
    public List<BankTeller> All(){
        return bankTellerRepository.findAll();
        
    }

    @GetMapping("/banktellers/{id}")
    public BankTeller get(@PathVariable Integer id ){
        return bankTellerRepository.getOne(id);
    }
}
