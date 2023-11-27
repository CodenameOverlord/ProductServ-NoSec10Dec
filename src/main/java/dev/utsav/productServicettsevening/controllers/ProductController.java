package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.dtos.ProductDtoReq;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.models.Product;
import dev.utsav.productServicettsevening.services.ProductService;
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

//  Only allow admin to fetch all products
    @GetMapping("")
    public ResponseEntity<List<ProductDtoRes>> getAllProducts() {
       return this.productService.getAllProducts();
//        ResponseEntity<List<Product>> res = new ResponseEntity<>(
//                this.productService.getAllProducts(), HttpStatus.OK
//        );
//        return res;
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
    public ResponseEntity<ProductDtoRes> addNewProduct(@RequestBody ProductDtoReq productDtoReq){
        ProductDtoRes product = this.productService.addNewProduct(productDtoReq);
        ResponseEntity<ProductDtoRes> response = new ResponseEntity<>(product,
                HttpStatus.CREATED);
        return response;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@RequestBody ProductDtoRes productDtoRes){
        return "updating product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId){
        return "deleting Product with prodId"+productId;
    }
}
