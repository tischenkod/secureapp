package com.datischenko.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }


    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal){
        return principal;
    }
}
