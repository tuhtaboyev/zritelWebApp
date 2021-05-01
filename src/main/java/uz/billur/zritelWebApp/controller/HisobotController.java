package uz.billur.zritelWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.billur.zritelWebApp.model.User;
import uz.billur.zritelWebApp.services.HisobotServis;
import uz.billur.zritelWebApp.services.UserServis;

@Controller
@RequestMapping("/hisobot")
public class HisobotController {
    @Autowired
    private HisobotServis hisbotServis;

    @Autowired
    private UserServis userServis;

    @ExceptionHandler(Exception.class)
    public String Exception(Exception e, Model model){
        model.addAttribute("hato", e);
        return "hisobot/hato";
    }

    @PostMapping("/hisobot")
    public String ChekLogin(@ModelAttribute("user") User user, Model model) throws Exception {
if(userServis.chekLogin(user)==true){
    model.addAttribute("users", hisbotServis.ListHisobot());
    return "hisobot/hisobot";
        }else {
    Exception e= null;
    e.getMessage();
    return "hisobot/hato";
}

     }
    }
