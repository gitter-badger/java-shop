package lv.javaguru.shop.controller;

import lv.javaguru.shop.entity.Product;
import lv.javaguru.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/")
    public String index(Model model) {
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("products", products);

        return "index";
    }
}
