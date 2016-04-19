package lv.javaguru.shop.repository;

import lv.javaguru.shop.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
