package allianz2020.ejemplo2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class BeanServiceDispatcher {
    @Getter(AccessLevel.PROTECTED)
    private final BeanFactory beanFactory;

    public BigDecimal getTax(String subsidiary) {
        BeanService z = BeanFactoryAnnotationUtils.qualifiedBeanOfType(beanFactory, BeanService.class, subsidiary);

        return z.getTax();
    }

}
