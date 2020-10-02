package allianz2020.ejemplo2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PRO")
@SpringBootTest
public class TestConfigurationPRO {
    @Value("${server.port}")
    Integer port;

    @Autowired
    BeanRestPRO bean;

    @Test
    void rest_bean_ok() {
        Assertions.assertNotNull(bean);
    }

    @Test
    void rest_port_ok() {
        Assertions.assertEquals(8080, port);
    }

}
