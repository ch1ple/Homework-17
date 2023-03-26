package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloCalculator {
    private final CalculatorService calculatorService;

    public HelloCalculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Параметры поданы неккоректно";
        }
        return calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Параметры поданы неккоректно";
        }
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Параметры поданы неккоректно";
        }
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка. Параметры поданы неккоректно";
        }
        if (num2 == 0) {
            return "Ошибка. На 0 делить нельзя";
        }
        return calculatorService.divide(num1, num2);
    }
}
