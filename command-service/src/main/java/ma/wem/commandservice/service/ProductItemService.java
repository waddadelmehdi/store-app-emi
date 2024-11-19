package ma.wem.commandservice.service;

import ma.wem.commandservice.dao.entities.ProductItem;
import ma.wem.commandservice.dao.repositories.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductItemService implements ProductItemManager{
    @Autowired
    private ProductItemRepository productItemRepository;
    @Override
    public ProductItem addProductItem(ProductItem productItem) {
        try {
            return productItemRepository.save(productItem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteProductItem(ProductItem productItem) {
        try {
            productItemRepository.delete(productItem);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public ProductItem updateProductItem(ProductItem productItem) {
        try {
            return productItemRepository.save(productItem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<ProductItem> getAllProductItem() {
        return productItemRepository.findAll();
    }

    @Override
    public ProductItem getProductItemById(Long id) {
        return productItemRepository.findProductItemById(id);
    }
}
