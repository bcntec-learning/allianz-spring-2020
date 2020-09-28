package allianz2020.ejemplo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController //@Controller
public class BeanRest {
    private final BeanService beanService;

    //Constructor Injection
    public BeanRest(BeanService beanService) {
        this.beanService = beanService;
    }

    @GetMapping("/tax")
    public BigDecimal getTax() {
        return beanService.getTax();
    }

    @GetMapping("/add")
    public BigDecimal sum(@RequestParam BigDecimal value) {
        return  beanService.add(value);
    }
}
