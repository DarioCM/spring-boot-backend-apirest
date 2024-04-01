package com.carlos.springboot.backend.apirest.controller;

import com.carlos.springboot.backend.apirest.models.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {


    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("message",customerService.getHelloMessage() );
        return "hello"; // The method then returns a string "hello", which is the name of the view to be rendered.
    }

}
