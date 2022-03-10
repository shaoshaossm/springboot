package com.bjpowernode.springboot.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    public ModelAndView say(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","Hello Springboot jsp");
        modelAndView.setViewName("say");
        return modelAndView;

    }
    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("message","HelloWorld");
        return "say";
    }
}
