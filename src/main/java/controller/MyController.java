package controller;

import model.User;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Цымбалюк Сергей on 18.07.2016.
 */
@Controller
public class MyController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public ModelAndView user(){
        return new ModelAndView("user","command", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("mvc-dispatcher") User user, ModelMap model){
        model.addAttribute("name", user.getName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("age", user.getAge());
        return "result";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String   hello(){
        return "hello";
    }
}
