package allianz2020.ejemplo2;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Profile("PRO")
@RestController
public class BeanRestPRO {
    private final BeanServiceDispatcher serviceDispatcher;

    public BeanRestPRO(BeanServiceDispatcher serviceDispatcher) {
        this.serviceDispatcher = serviceDispatcher;
    }

    @GetMapping(value = "/tax")
    public BigDecimal tax(@RequestHeader("ALLIANZ-SUBSIDIARY") String subsidiary) {
        return serviceDispatcher.getTax(subsidiary);
    }

}
