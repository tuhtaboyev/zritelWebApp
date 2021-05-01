package uz.billur.zritelWebApp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.billur.zritelWebApp.model.User;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {



    @GetMapping()
    public String login(@ModelAttribute("login") User user){
        return "login";
    }


}
