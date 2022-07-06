package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getALL() {
        return productRepository.getALL();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        try {
            productRepository.delete(productId);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }

    }

}
