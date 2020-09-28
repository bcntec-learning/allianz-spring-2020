package allianz2020.ejemplo1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Primary
// beanFrance, allianz2020.ejemplo1.BeanFrance, allianz2020.ejemplo1.BusinessBean -> Qualifier FR
@Qualifier("FR")
@Component
public class BeanFrance implements BusinessBean{
    @Override
    public BigDecimal getTax() {
        return new BigDecimal(25);
    }
}
