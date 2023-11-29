package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String answerCalculatorHello() {
        return calculatorService.calculatorHello();
    }

    @GetMapping(path = "/plus")
    public String calculatePlusAnswer(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 & num2 == 0){
            return "<strong><BLOCKQUOTE><font size=\"20\" color= \"ff0000\">Ошибка, не передан параметр</font></BLOCKQUOTE></strong>";
        }
        return num1 + " + " + num2 + " = " + calculatorService.calculatePlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateMinusAnswer(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 & num2 == 0){
            return "<strong><BLOCKQUOTE><font size=\"20\" color= \"ff0000\">Ошибка, не передан параметр</font></BLOCKQUOTE></strong>";
        }
        return num1 + " - " + num2 + " = " + calculatorService.calculateMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplyAnswer(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 & num2 == 0){
            return "<strong><BLOCKQUOTE><font size=\"20\" color= \"ff0000\">Ошибка, не передан параметр</font></BLOCKQUOTE></strong>";
        }
        return num1 + " * " + num2 + " = " + calculatorService.calculateMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivideAnswer(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 & num2 == 0){
            return "<strong><BLOCKQUOTE><font size=\"20\" color= \"ff0000\">Ошибка, не передан параметр</font></BLOCKQUOTE></strong>";
        } else if (num1 == 0 || num2 == 0) {
            return "<strong><BLOCKQUOTE><font size=\"20\" color= \"ff0000\">На ноль делить нельзя!!!</font></BLOCKQUOTE></strong>";
        }
        return num1 + " / " + num2 + " = " + calculatorService.calculateDivide(num1, num2);
    }


}


