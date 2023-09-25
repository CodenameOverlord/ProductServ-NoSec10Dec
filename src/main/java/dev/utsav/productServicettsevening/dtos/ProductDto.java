package dev.utsav.productServicettsevening.dtos;

import lombok.Getter;
import lombok.Setter;
import dev.utsav.productServicettsevening.models.Category;

@Getter
@Setter
public class ProductDto {
    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageUrl;
}
