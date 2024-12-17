package ma.wem.productservice.web;

import ma.wem.productservice.dao.entities.Product;
import ma.wem.productservice.service.ProductManager;
import ma.wem.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductManager productManager;

    @GetMapping("/products")
    public List<Product> getClients() {
        return productManager.getAllProducts();
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productManager.addProduct(product);
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return productManager.updateProduct(product);
    }
    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestBody Product product) {
        productManager.deleteProduct(product);
    }
    @GetMapping("/products/{id}")
    public Product getClientById(@PathVariable String id) {
        return productManager.getProductById(id);
    }

}
