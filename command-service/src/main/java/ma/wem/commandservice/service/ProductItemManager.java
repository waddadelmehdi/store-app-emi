package ma.wem.commandservice.service;

import ma.wem.commandservice.dao.entities.Command;
import ma.wem.commandservice.dao.entities.ProductItem;

import java.util.List;

public interface ProductItemManager {
    public ProductItem addProductItem(ProductItem productItem);
    public boolean deleteProductItem(ProductItem productItem);
    public ProductItem updateProductItem(ProductItem productItem);
    public List<ProductItem> getAllProductItem();
    public ProductItem getProductItemById(Long id);
}
