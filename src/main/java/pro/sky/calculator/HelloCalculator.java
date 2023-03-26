package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloCalculator {
    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
}
