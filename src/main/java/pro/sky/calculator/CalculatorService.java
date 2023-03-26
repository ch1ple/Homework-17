package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String sum(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        return num1 + " - " + num2 + " = " + minus;
    }
    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }
    public String divide(int num1, int num2) {
        int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;
    }
}
