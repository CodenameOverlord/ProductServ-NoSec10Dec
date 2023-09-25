package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.dtos.ProductDto;
import dev.utsav.productServicettsevening.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
//    public ProductController(ProductService productService){
//        this.productService = productService;
//    }
    @GetMapping("")
    public String getAllProducts() {
        return "Getting All Products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Returning Single Product with id: " + productId;
    }

    @PostMapping("")
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "new Product added";
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
