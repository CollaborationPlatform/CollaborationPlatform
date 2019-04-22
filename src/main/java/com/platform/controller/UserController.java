package com.platform.controller;

import com.platform.po.User;
import com.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login.action")
    public String loginAction(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model, HttpSession session) {
        User user = userService.findUser(username, password);

        if (user == null) {
            model.addAttribute("msg", "Wrong username or password. Please input correctly.");
            return "login";
        }
        session.setAttribute("USER_SESSION", user);
        return "redirect:main";
    }

    @RequestMapping("/logout.action")
    public String logoutAction(Model model, HttpSession session) {
        session.invalidate();
        model.addAttribute("msg", "logout successfully.");
        return "login";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/register.action")
    public String register(User user, Model model, HttpSession session) {
        String msg = this.userService.addUser(user);
        if (msg == null) {
            session.setAttribute("USER_SESSION", user);
            return "redirect:main";
        }
        model.addAttribute("msg", msg);
        return "register";
    }
}
