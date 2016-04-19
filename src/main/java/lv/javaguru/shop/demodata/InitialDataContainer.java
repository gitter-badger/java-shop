package lv.javaguru.shop.demodata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lv.javaguru.shop.entity.Category;
import lv.javaguru.shop.entity.Product;

import java.util.List;

public class InitialDataContainer {
    @JsonProperty
    private List<Product> products;

    @JsonProperty
    private List<Category> categories;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
