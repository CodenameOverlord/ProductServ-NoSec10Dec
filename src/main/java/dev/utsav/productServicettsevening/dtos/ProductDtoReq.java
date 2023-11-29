package dev.utsav.productServicettsevening.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDtoReq {
    private String title;
    private double price;
    private String description;
    private Long categoryId;
    private String imageUrl;

}
