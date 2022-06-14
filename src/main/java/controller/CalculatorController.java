package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public ModelAndView loadIndex(){
        return new ModelAndView("calculator");
    }
    @PostMapping("/calculator")
//    Khai bao cac con so va dang du lieu
    public ModelAndView select(@RequestParam("num1")double num1,@RequestParam("sign")String sign,@RequestParam("num2")double num2){
        ModelAndView modelAndView =new ModelAndView("calculator");
        double select =calculator(num1,num2, sign);
        modelAndView.addObject("result",select);
        return modelAndView;

    }
    private double calculator (double num1, double num2, String sign){
        switch (sign){
            case "+":
                return num1+num2;

            case "-":
                return num1-num2;

            case "/":
                if (num2==0)
                    throw new ArithmeticException("chia tdn duoc cho 0");
                else
                    return num1/num2;

            case "*":
                return num1*num2;

            default:
                throw new RuntimeException("Invalid math")    ;

        }
    }
}