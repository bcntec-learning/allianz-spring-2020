package allianz2020.ejemplo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// beanGermany, allianz2020.ejemplo1.BeanGermany, allianz2020.ejemplo1.BusinessBean -> Qualifier GR
@Qualifier("GR")
@Component
public class BeanGermany implements BusinessBean {
    @Override
    public BigDecimal getTax() {
        return new BigDecimal(23);
    }
}
