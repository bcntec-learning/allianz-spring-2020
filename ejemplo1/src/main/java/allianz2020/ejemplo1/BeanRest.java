package allianz2020.ejemplo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    @GetMapping(value="/calc", params = "value")
    public BigDecimal sum(@RequestParam BigDecimal value, HttpSession session) {
        BigDecimal total = Optional.ofNullable((BigDecimal) session.getAttribute("TOTAL")).orElse(BigDecimal.ZERO);
        List<BigDecimal> numbers = (List<BigDecimal>) Optional.ofNullable(session.getAttribute("DATA"))
                .orElse(Collections.emptyList());
        numbers.add(value);
        BigDecimal u =  beanService.calc(value);
        total= total.add(u);
        session.setAttribute("TOTAL", total);
        session.setAttribute("DATA", numbers);
        return total;
    }

    @GetMapping(value="/reset")
    public void sum( HttpSession session) {
        Optional.ofNullable(session).ifPresent(HttpSession::invalidate);
    }

    @GetMapping("/add")
    public BigDecimal sum(@RequestParam BigDecimal value) {
        return  beanService.add(value);
    }
}
