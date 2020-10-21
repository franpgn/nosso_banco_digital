package com.banco.nosso_banco_digital.controller;

import com.banco.nosso_banco_digital.repository.AddressRepository;
import com.banco.nosso_banco_digital.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.banco.nosso_banco_digital.model.Address;
import com.banco.nosso_banco_digital.model.User;

@Controller
public class SignUpController {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @RequestMapping("/")
    public String next(User user){
        return "landing.jsp";
    }

    @RequestMapping("/signupfirst")
    public String signupfirst(){
        return "signupfirst.jsp";
    }

    @RequestMapping("/signupsecond")
    public String signupsecond(User user){
        if (user.validateCpf(user.getCpf())==true & user.validateEmail(user.getEmail())){
            userRepository.save(user);
        }
        return "signupsecond.jsp";
    }

    @RequestMapping("/page")
    public String landing(Address address){
        addressRepository.save(address);
        return "page.jsp";
    }
}
