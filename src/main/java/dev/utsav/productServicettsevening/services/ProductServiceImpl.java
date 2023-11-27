package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.ProductDtoReq;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.models.Product;
import dev.utsav.productServicettsevening.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ResponseEntity<List<ProductDtoRes>> getAllProducts() {
        ResponseEntity<List<ProductDtoRes>> response = null;
        List<Product> products = this.productRepository.findAll();
        List<ProductDtoRes> productDtoRes = new ArrayList<>();
        for(Product product: products){
            productDtoRes.add(ProductDtoRes.convertProductToProductDto(product));
        }
        return new ResponseEntity<>(productDtoRes, HttpStatus.OK);
    }

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public ProductDtoRes addNewProduct(ProductDtoReq productDtoReq) {
        Product product = new Product();
        product.setDescription(productDtoReq.getDescription());
        product.setImageUrl(productDtoReq.getImageUrl());
        product.setPrice(productDtoReq.getPrice());
        product.setTitle(productDtoReq.getTitle());
        Product savedProduct = productRepository.save(product);
        ProductDtoRes productDtoRes  = ProductDtoRes.convertProductToProductDto(product);

        return productDtoRes;
    }

    @Override
    public Product updateProduct(Long productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
