package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.exception.ResourceNotFoundException;
import com.proiect.Coffee_Shop.model.Product;
import com.proiect.Coffee_Shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product= productRepository.findById(id);
        if( product.isPresent()){
            return product.get();
        }else{
            throw new ResourceNotFoundException("Product", "id", id);
        }
    }

    @Override
    public Product updateProduct(Product product, int id) {

        Product existingProduct= productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", id));

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    @Override
    public void deleteCoffee(int id) {

        productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", id));
        productRepository.deleteById(id);
    }
}
