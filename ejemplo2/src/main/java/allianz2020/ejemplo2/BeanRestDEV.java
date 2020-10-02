package allianz2020.ejemplo2;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Profile("DEV")
@RestController
public class BeanRestDEV {
    private final BeanServiceDispatcher serviceDispatcher;

    public BeanRestDEV(BeanServiceDispatcher serviceDispatcher) {
        this.serviceDispatcher = serviceDispatcher;
    }


    @GetMapping(value = "/tax")
    public BigDecimal tax(@RequestParam("ALLIANZ-SUBSIDIARY") String subsidiary) {
        return serviceDispatcher.getTax(subsidiary);
    }

}
