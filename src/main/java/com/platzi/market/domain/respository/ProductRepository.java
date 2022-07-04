package com.platzi.market.domain.respository;

import com.platzi.market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getALL();
    Optional <List<Product>> getByCategory (int categoryId);
    Optional<List<Product>> getScarseProducts (int quantity);
    Optional <Product> getProduct (int productId);
    Product save (Product prdouct);
    void delete(int productId);

}
