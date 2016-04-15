package lv.javaguru.shop.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lv.javaguru.shop.demodata.InitialDataContainer;
import lv.javaguru.shop.repository.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
class DemoData {
    private static final Logger logger = Logger.getLogger(DemoData.class);
    private ProductRepository productRepository;

    @PostConstruct
    public void dataLoader() throws IOException {
        logger.info("Populating database");
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Resource dataResource = new ClassPathResource("demo_data/data.yaml");

        InitialDataContainer demoData = mapper.readValue(dataResource.getFile(), InitialDataContainer.class);

        if (productRepository.count() == 0) {
            logger.info("Loading initial data for products table");
            productRepository.save(demoData.getProducts());
        }
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
