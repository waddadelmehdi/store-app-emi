package ma.wem.productservice.service;

import ma.wem.productservice.dao.entities.Product;

import java.util.List;

public interface ProductManager {
    public Product addProduct(Product product);
    public boolean deleteProduct(Product product);
    public Product updateProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(String id);
}
