package ma.wem.productservice.service;

import ma.wem.productservice.dao.entities.Product;
import ma.wem.productservice.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductManager{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        try {
            return productRepository.save(product);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteProduct(Product product) {
        try {
            productRepository.delete(product);
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Product updateProduct(Product product) {
        try {
            return productRepository.save(product);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findProductsById(id);
    }
}
