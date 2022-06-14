package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CondimentsController {

    @GetMapping("/save")
    public ModelAndView condiment() {
        return new ModelAndView("Ravi");
    }

    @PostMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("Ravi");
        modelAndView.addObject("condiment", condiment);
        return modelAndView;
    }
}