
package pro.sky.skyprospringcalculator;

public interface CalculatorService {
    String calculatorIntro();

    String calculatorHello();

    int calculatePlus(int num1, int num2);

    int calculateMinus(int num1, int num2);

    int calculateMultiply(int num1, int num2);

    int calculateDivide(int num1, int num2);
}
