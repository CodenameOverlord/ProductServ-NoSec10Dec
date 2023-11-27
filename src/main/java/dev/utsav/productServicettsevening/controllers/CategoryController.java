package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.dtos.CategoryReqDto;
import dev.utsav.productServicettsevening.dtos.CategoryResDto;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.services.CategoryService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("")
    public String getAllProducts() {
        return "Getting All Categories";
    }

    @GetMapping("/{categoryId}")
    public String getSingleProduct(@PathVariable("categoryId") Long categoryId) {
        return "Returning Single Product with id: " + categoryId;
    }

    @PostMapping("")
    public ResponseEntity<CategoryResDto> addNewCategory(@RequestBody CategoryReqDto categoryReqDto){
        CategoryResDto categoryResDto = this.categoryService.addNewCategory(categoryReqDto);
        ResponseEntity<CategoryResDto> response = new ResponseEntity<>(categoryResDto,
                HttpStatus.CREATED);
        return response;

    }

    @PutMapping("/{categoryId}")
    public String updateProduct(@RequestBody CategoryReqDto CategoryReqDto, @PathVariable("categoryId") Long categoryId){
        return "updating Category with categoryId "+ categoryId;
    }

    @DeleteMapping("/{categoryId}")
    public String deleteProduct(@PathVariable ("categoryId") Long categoryId){
        return "deleting category categoryId : "+ categoryId;
    }
}
