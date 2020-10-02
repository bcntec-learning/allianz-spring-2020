package allianz2020.ejemplo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Profile("BETA")
@Service
@Qualifier("ES")
public class BeanServiceES implements BeanService {
    @Override
    public BigDecimal getTax() {
        return new BigDecimal(21);
    }
}
