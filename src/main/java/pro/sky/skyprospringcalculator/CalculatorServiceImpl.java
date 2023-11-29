package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculatorIntro() {
        return "<strong><BLOCKQUOTE><font size=\"20\" color= \"000000\">Введите /calculator и сможете воспользоваться последней версией калькулятора Java</font></BLOCKQUOTE></strong>";
    }

    public String calculatorHello() {
        return "<strong><BLOCKQUOTE><font size=\"20\" color= \"BA55D3\">Добро пожаловать в калькулятор!!!</font></BLOCKQUOTE></strong>"
                + "<strong><BLOCKQUOTE><font size=\"20\" color= \"0000ff\">Чтобы выполнить операцию сложения введите /plus?num1=X&num2=Y, а вместо X и Y подставьте любые числа</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"e07f1f\">Чтобы выполнить операцию вычитания введите /minus?num1=X&num2=Y</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"7fff00\">Чтобы выполнить операцию умножения введите /multiply?num1=X&num2=Y</font></BLOCKQUOTE></strong>" +
                "<strong><BLOCKQUOTE><font size=\"20\" color= \"e34234\">Чтобы выполнить операцию деления введите /divide?num1=X&num2=Y</font></BLOCKQUOTE></strong>";
    }

    public int calculatePlus(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;
    }

    public int calculateDivide(int num1, int num2) {
        return num1 / num2;
    }
}


