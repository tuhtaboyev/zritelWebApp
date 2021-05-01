package uz.billur.zritelWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.billur.zritelWebApp.model.User;
import uz.billur.zritelWebApp.services.UserServis;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServis userServis;

    @GetMapping()
    public String ListUser( Model model) throws IOException, SQLException {
        model.addAttribute("users",userServis.ListUser());
          return "user/user";
        }

    @GetMapping("/{id}")
    public String ChekUser( User user) throws IOException, SQLException {
        userServis.ShowUser(user);
        return "user/user";
    }


    @PostMapping("/new")
    public String create(User user) throws IOException, SQLException {
        userServis.SaveUser(user);
            return "redirect:/user";
        }


    @GetMapping("/{id}/edit")
    public String edit(Model model,User user) throws IOException, SQLException {
            model.addAttribute("edituser", userServis.ShowUser(user));
            return "user/edit";
    }


    @PostMapping("/saveUpdatedUser")
    public String update(User user) throws IOException, SQLException {
        userServis.UpdateUser(user);
        return "redirect:/user";

    }
    @GetMapping("/{id}/delete")
    public String deleteUser(User user) throws IOException, SQLException {
        userServis.DeleteUser(user);
        return "redirect:/user";
    }

}
