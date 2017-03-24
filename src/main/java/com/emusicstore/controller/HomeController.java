package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Vytlasai on 3/23/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout, Model model){

        if(error !=null){
            model.addAttribute("error", "Invalid username and password");
        }

        if(logout !=null){
            model.addAttribute("msg", "You've logged out Successfully");
        }
        return "login";
    }
}
