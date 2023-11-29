package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorIntro {
    private final CalculatorService calculatorService;

    public CalculatorIntro(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculatorIntro() {
        return calculatorService.calculatorIntro();
    }
}
