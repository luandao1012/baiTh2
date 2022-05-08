package baith2.repository;

import baith2.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProducRepository extends JpaRepository<Product,Integer> {
    Product findByCode(String code);
    Product deleteByCode(String code);
}
