package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
     Product saveProduct(Product product);
     List<Product> getAllProducts();
     Product getProductById(int id);
     Product updateProduct(Product product, int id);
     void deleteCoffee(int id);
}
