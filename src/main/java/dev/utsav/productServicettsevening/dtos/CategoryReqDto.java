package dev.utsav.productServicettsevening.dtos;

import dev.utsav.productServicettsevening.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CategoryReqDto {
    private String name;
    private String description;

}
