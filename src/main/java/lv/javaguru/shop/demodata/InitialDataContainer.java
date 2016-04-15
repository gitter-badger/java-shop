package lv.javaguru.shop.demodata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lv.javaguru.shop.domain.Product;

import java.util.List;

public class InitialDataContainer {
    @JsonProperty
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
