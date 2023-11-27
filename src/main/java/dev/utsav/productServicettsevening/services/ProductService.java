package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.ProductDtoReq;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.models.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {
    ResponseEntity<List<ProductDtoRes>> getAllProducts();
    Product getSingleProduct(Long productId);
    ProductDtoRes addNewProduct(ProductDtoReq productDtoReq);
    Product updateProduct(Long productId);
    boolean deleteProduct(Long productId);
}
