package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.CategoryReqDto;
import dev.utsav.productServicettsevening.dtos.CategoryResDto;
import dev.utsav.productServicettsevening.dtos.ProductDtoReq;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.models.Product;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    List<CategoryResDto> getAllCategories();
    CategoryResDto getSingleCatrogory(Long CategoryId);
    CategoryResDto addNewCategory(CategoryReqDto CategoryReqDto);
//    Product updateProduct(Long productId);
//    boolean deleteProduct(Long productId);
}
