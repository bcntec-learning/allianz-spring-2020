package allianz2020.ejemplo2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class TestConfigurationNoProfile {

    @Qualifier("ES")
    @Autowired(required = false)
    BeanService serviceES;

    @Qualifier("GR")
    @Autowired
    BeanService serviceGR;

    @Qualifier("FR")
    @Autowired
    BeanService serviceFR;

    @Test
    void contextLoads() {

        Assertions.assertNull(serviceES);
        Assertions.assertNotNull(serviceGR);
        Assertions.assertNotNull(serviceFR);
    }

}
