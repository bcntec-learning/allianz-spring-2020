package allianz2020.ejemplo2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("BETA")
@SpringBootTest
public class TestConfigurationBETA {

    @Qualifier("ES")
    @Autowired
    BeanService beanService;

    @Test
    void contextLoads() {
        Assertions.assertNotNull(beanService);
    }

}
