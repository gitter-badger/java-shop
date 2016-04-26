package lv.javaguru.shop.config;

import com.lyncode.jtwig.mvc.JtwigViewResolver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class WebConfig {
    @Value("${jtwig.cache?:false}")
    private Boolean jtwigCache;

    @Value("${jtwig.prefix?:classpath:/templates/}")
    private String jtwigPrefix;

    @Value("${jtwig.suffix?:.twig}")
    private String jtwigSuffix;

    @Bean
    public ViewResolver viewResolver() {
        JtwigViewResolver resolver = new JtwigViewResolver();
        resolver.setCache(jtwigCache);
        resolver.setPrefix(jtwigPrefix);
        resolver.setSuffix(jtwigSuffix);
        return resolver;
    }
}
