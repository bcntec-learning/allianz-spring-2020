package allianz2020.ejemplo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Qualifier("GR")
public class BeanServiceGR implements BeanService {
    @Override
    public BigDecimal getTax() {
        return new BigDecimal(18);
    }
}
