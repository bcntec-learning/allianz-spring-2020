package allianz2020.ejemplo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("DEV")
@SpringBootTest
public class TestConfigurationDEV {

    @Value("${server.port}")
    Integer port;

    @Autowired
    BeanRestDEV bean;


    @Test
    void rest_bean_ok() {
        Assertions.assertNotNull(bean);
    }

    @Test
    void rest_port_ok() {
        Assertions.assertEquals(8081, port);
    }

}
