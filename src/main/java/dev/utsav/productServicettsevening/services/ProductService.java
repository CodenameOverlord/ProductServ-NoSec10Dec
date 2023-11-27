package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.ProductDto;
import dev.utsav.productServicettsevening.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getSingleProduct(Long productId);
    Product addNewProduct(ProductDto productDto);
    Product updateProduct(Long productId);
    boolean deleteProduct(Long productId);
}
