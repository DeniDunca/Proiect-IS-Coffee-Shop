package com.proiect.Coffee_Shop.controller;

import com.proiect.Coffee_Shop.model.Product;
import com.proiect.Coffee_Shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/api/products", produces="application/json", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@CrossOrigin

public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        super();
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int productId){

        return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);
    }


    @PutMapping("/put/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") int productId,@RequestBody Product product){

        return new ResponseEntity<Product>(productService.updateProduct(product, productId), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int productID){
        productService.deleteCoffee(productID);
        return new ResponseEntity<String>("Product deleted successfully", HttpStatus.OK);

    }

}
