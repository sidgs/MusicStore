package com.emusicstore.controller;

/**
 * Created by Vytlasai on 3/22/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Vytlasai on 3/21/2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam (value = "error", required = false) String error,
                        @RequestParam(value = "logout", required = false) String logout, Model model) {

        if (error != null) {
            model.addAttribute("error","invalid username and password");
        }

        if (error !=null) {
            model.addAttribute("msg", "You have been logged out successfully");
        }

        return "login";
    }

}
