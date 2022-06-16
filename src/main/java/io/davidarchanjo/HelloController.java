package io.davidarchanjo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("{color}")
    public String hello(@PathVariable String color, @RequestParam String name, Model model) {
        User user = new User(name);
        model.addAttribute("bkg", color);
        model.addAttribute("user", user);
        model.addAttribute("title", "Spring MVC Thymeleaf");
        return "greeting";
    }
}
