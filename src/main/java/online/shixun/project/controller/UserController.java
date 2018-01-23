package online.shixun.project.controller;


import online.shixun.project.entity.DefaultUser;
import online.shixun.project.entity.SimpleUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "user")
public class UserController {
    String mess=null;
    //http:8080/springmvc/user/{type}/register
    @GetMapping("{type}/register")
    public String registerPage(Model model, @PathVariable("type") String userType) {
        System.out.println("进入"+userType+"用户注册页面....");
        return userType+"Register";
    }


    @RequestMapping(value = "simple",method = RequestMethod.POST)
    public String simpleUserRegister(@Valid @ModelAttribute  SimpleUser simpleUser, BindingResult bindingResult,Model model ){
        System.out.println(simpleUser.toString());
//        System.out.println(bindingResult.hasErrors());
//        System.out.println(bindingResult.getFieldError().getDefaultMessage());
        if (bindingResult.hasErrors()){
        mess=bindingResult.getFieldError().getDefaultMessage();
        model.addAttribute("message",mess);
        return "simpleRegister";
    }
    return "registerSuccess";
    }


    @RequestMapping(value = "default",method = RequestMethod.POST)
    public String defaultRegister(@Valid @ModelAttribute DefaultUser defaultUser ,BindingResult bindingResult ,Model model ){
        if (bindingResult.hasErrors()){
            mess=bindingResult.getFieldError().getDefaultMessage();
            model.addAttribute("message",mess);
            return "defaultRegister";
        }
        return "registerSuccess";
    }
}
