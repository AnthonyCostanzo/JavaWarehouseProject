package com.warehouse.v3.services;

import com.warehouse.v3.models.Product;
import com.warehouse.v3.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id)
                .map(prod -> {
                    prod.setName(updatedProduct.getName());
                    prod.setPrice(updatedProduct.getPrice());
                    prod.setQuantity(updatedProduct.getQuantity());
                    return productRepository.save(prod);
                })
                .orElseThrow(() -> new IllegalStateException("product does not exist"));
    }

    public String deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new IllegalStateException("prod does not exist");
        }
        productRepository.deleteById(id);
        return "Product with id: " + id + " successfully deleted";
    }

}
