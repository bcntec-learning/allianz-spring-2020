package allianz2020.ejemplo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

//@Scope("prototype")
@Component
public class BeanService {

    @Qualifier("GR") //GR!!!!
    @Autowired
    BusinessBean business; //FR is Primary!!!

    BigDecimal total = new BigDecimal(BigInteger.ZERO); //riesgo a la concurrencia

    public BigDecimal getTax() {
        return business.getTax();
    }
    /*
    @Qualifier("GR")
    @Autowired
    BusinessBean businessGR;

    @Qualifier("FR")
    @Autowired
    BusinessBean businessFR;
    */

    //singleton
    public BigDecimal add(BigDecimal value) {
        BigDecimal b = getTax().multiply(value).divide(new BigDecimal(100), RoundingMode.HALF_UP).add(value);
        total = total.add(b);
        return total;
    }
    public BigDecimal calc(BigDecimal value) {
        BigDecimal b = getTax().multiply(value).divide(new BigDecimal(100), RoundingMode.HALF_UP).add(value);
        total = total.add(b);
        return total;
    }

    public BigDecimal getTotal() {
        return total;
    }
}
