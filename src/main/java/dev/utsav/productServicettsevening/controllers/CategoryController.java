package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.dtos.CategoryDto;
import dev.utsav.productServicettsevening.dtos.ProductDto;
import dev.utsav.productServicettsevening.models.Category;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @GetMapping("")
    public String getAllProducts() {
        return "Getting All Categories";
    }

    @GetMapping("/{categoryId}")
    public String getSingleProduct(@PathVariable("categoryId") Long categoryId) {
        return "Returning Single Product with id: " + categoryId;
    }

    @PostMapping("")
    public String addNewCategory(@RequestBody CategoryDto categoryDto){
        return "new Category added";
    }

    @PutMapping("/{categoryId}")
    public String updateProduct(@RequestBody CategoryDto CategoryDto, @PathVariable("categoryId") Long categoryId){
        return "updating Category with categoryId "+ categoryId;
    }

    @DeleteMapping("/{categoryId}")
    public String deleteProduct(@PathVariable ("categoryId") Long categoryId){
        return "deleting category categoryId : "+ categoryId;
    }
}
