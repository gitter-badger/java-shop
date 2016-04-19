package lv.javaguru.shop.repository;

import lv.javaguru.shop.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
