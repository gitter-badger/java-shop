package lv.javaguru.shop.controller;

import lv.javaguru.shop.domain.Product;
import lv.javaguru.shop.exception.ProductNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductsController {
    @RequestMapping("/{id}")
    public String showProductPage(@PathVariable("id") Product product, Model model) {
        if (product == null) {
            throw new ProductNotFoundException();
        }
        model.addAttribute("product", product);
        return "products_show";
    }
}
