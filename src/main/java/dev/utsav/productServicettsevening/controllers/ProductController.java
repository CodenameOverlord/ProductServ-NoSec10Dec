package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.dtos.ProductDto;
import dev.utsav.productServicettsevening.models.Product;
import dev.utsav.productServicettsevening.services.ProductService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("")
    public ResponseEntity<List<Product>> getAllProducts() {
        ResponseEntity<List<Product>> res = new ResponseEntity<>(
                this.productService.getAllProducts(), HttpStatus.OK
        );
        return res;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId) {
        Product product = this.productService.getSingleProduct(productId);
        ResponseEntity<Product> response = new ResponseEntity<>(
                product, HttpStatus.OK
        );
        return response;
    }

    @PostMapping("")
    public ResponseEntity<Product> addNewProduct(@RequestBody ProductDto productDto){
        Product product = this.productService.addNewProduct(productDto);
        ResponseEntity<Product> response = new ResponseEntity<>(product,
                HttpStatus.CREATED);
        return response;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@RequestBody ProductDto productDto){
        return "updating product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId){
        return "deleting Product with prodId"+productId;
    }
}
