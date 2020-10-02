package allianz2020.ejemplo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Qualifier("FR")
public class BeanServiceFR implements BeanService {
    @Override
    public BigDecimal getTax() {
        return new BigDecimal(24);
    }
}
