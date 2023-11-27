package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.CategoryReqDto;
import dev.utsav.productServicettsevening.dtos.CategoryResDto;
import dev.utsav.productServicettsevening.models.Category;
import dev.utsav.productServicettsevening.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<CategoryResDto> getAllCategories() {
        return null;
    }

    @Override
    public CategoryResDto getSingleCatrogory(Long CategoryId) {
        return null;
    }

    @Override
    public CategoryResDto addNewCategory(CategoryReqDto categoryReqDto) {
        Category category = new Category();
        category.setName(categoryReqDto.getName());
        category.setDescription(categoryReqDto.getDescription());
        Category categorySaved = categoryRepository.save(category);
        CategoryResDto categoryResDto = CategoryResDto.convertToCategoryResDto(categorySaved);
        return categoryResDto;
    }
}
