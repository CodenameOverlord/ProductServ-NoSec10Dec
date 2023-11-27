package dev.utsav.productServicettsevening.dtos;

import lombok.Getter;
import lombok.Setter;
import dev.utsav.productServicettsevening.models.Category;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;
}
