package lv.javaguru.shop.component;

import lv.javaguru.shop.common.helper.Number;
import lv.javaguru.shop.entity.Category;
import lv.javaguru.shop.entity.Product;
import lv.javaguru.shop.repository.CategoryRepository;
import lv.javaguru.shop.repository.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.*;

@Component
class DemoData {
    private static final Logger logger = Logger.getLogger(DemoData.class);
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @PostConstruct
    public void dataLoader() throws IOException {
        logger.info("Populating database");

        if (productRepository.count() == 0 && categoryRepository.count() == 0) {

            Category computers = new Category("Computers");
            Category laptops = new Category("Laptops / Notebook Computers", computers);
            Category tablets = new Category("Tablets", computers);
            Category desktopComputers = new Category("Desktop Computers", computers);

            Category camerasAndCamcorders = new Category("Cameras & Camcorders");
            Category digitalCameras = new Category("Digital Cameras", camerasAndCamcorders);

            categoryRepository.save(Arrays.asList(
                    computers,
                    laptops,
                    tablets,
                    desktopComputers,
                    camerasAndCamcorders,
                    digitalCameras
            ));


            Product appleMacBook = new Product();
            appleMacBook.setCategories(Arrays.asList(laptops, computers));
            appleMacBook.setName("Apple MacBook Pro 13.3\" i5 Notebook Computer - MD101LL/A");
            appleMacBook.setPrice(1073.09D);
            appleMacBook.setQty(100L);
            appleMacBook.setImages(getLoremImages());

            Product toshibaComputer = new Product();
            toshibaComputer.setName("Toshiba Silver Chromebook 2 Computer - CB35-B3330");
            toshibaComputer.setCategories(Arrays.asList(laptops, computers));
            toshibaComputer.setPrice(219.00D);
            toshibaComputer.setQty(34L);
            toshibaComputer.setImages(getLoremImages());

            Product asusComputer = new Product();
            asusComputer.setName("Asus Chromebook Flip C100 Silver Laptop Computer - C100PA-DB02");
            asusComputer.setCategories(Arrays.asList(laptops, computers));
            asusComputer.setPrice(279D);
            asusComputer.setQty(20L);
            asusComputer.setImages(getLoremImages());


            Product tablet1 = new Product();
            tablet1.setName("Apple iPad Mini With Retina Display Space Grey Wi-Fi 16GB - ME276LL/A");
            tablet1.setCategories(Arrays.asList(computers, tablets));
            tablet1.setPrice(269D);
            tablet1.setQty(0L);
            tablet1.setImages(getLoremImages());

            Product comp1 = new Product();
            comp1.setCategories(Arrays.asList(computers, desktopComputers));
            comp1.setName("Apple 21.5 iMac 3.1GHz Intel Quad-Core i5 Retina 4K Desktop Computer");
            comp1.setQty(100L);
            comp1.setPrice(1463.83D);
            comp1.setImages(getLoremImages());

            Product comp2 = new Product();
            comp2.setCategories(Arrays.asList(computers, desktopComputers));
            comp2.setName("Dell XPS 8700 Black Desktop Computer - X8700-2815BLK");
            comp2.setPrice(999D);
            comp2.setQty(10L);
            comp2.setImages(getLoremImages());


            Product camera1 = new Product();
            camera1.setCategories(Arrays.asList(digitalCameras, camerasAndCamcorders));
            camera1.setPrice(499.00);
            camera1.setQty(0L);
            camera1.setName("Canon EOS Rebel SL1 18-55mm DSLR Camera Kit - 8575B003");
            camera1.setImages(getLoremImages());

            productRepository.save(Arrays.asList(
                    appleMacBook,
                    toshibaComputer,
                    asusComputer,
                    tablet1,
                    comp1,
                    comp2,
                    camera1
            ));

        }
    }

    private List<String> getLoremImages() {
        int size = Number.getRandomIntegerBetween(1, 5);
        Set<String> loremImages = new HashSet<>();

        while (size > 0) {
            int n = Number.getRandomIntegerBetween(1, 10);
            loremImages.add("http://lorempixel.com/650/900/technics/" + n + "/");
            size--;
        }

        return new LinkedList<>(loremImages);
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
