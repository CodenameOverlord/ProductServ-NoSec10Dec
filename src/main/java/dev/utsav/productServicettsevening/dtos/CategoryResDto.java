package dev.utsav.productServicettsevening.dtos;

import dev.utsav.productServicettsevening.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryResDto {
    private String name;
    private String description;
    private Long categoryId;


    public static CategoryResDto convertToCategoryResDto(Category category) {
        CategoryResDto categoryResDto = new CategoryResDto();
        categoryResDto.setCategoryId(category.getId());
        categoryResDto.setName(category.getName());
        categoryResDto.setDescription(category.getDescription());
        return categoryResDto;
    }
}
