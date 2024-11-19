package ma.wem.commandservice.dao.repositories;

import ma.wem.commandservice.dao.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
    ProductItem findProductItemById(long id);
}
