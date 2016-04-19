package lv.javaguru.shop.repository;

import lv.javaguru.shop.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
