package ma.wem.productservice.dao.repositories;

import ma.wem.productservice.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    Product findProductsById(String id);
}
