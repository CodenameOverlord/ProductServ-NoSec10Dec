package dev.utsav.productServicettsevening.dtos;

import dev.utsav.productServicettsevening.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDtoRes {
    private Long id;
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;

    public static ProductDtoRes convertProductToProductDto(Product product) {
        ProductDtoRes productDtoRes = new ProductDtoRes();
        productDtoRes.setId(product.getId());
        productDtoRes.setTitle(product.getTitle());
        productDtoRes.setPrice(product.getPrice());
        productDtoRes.setCategory(product.getCategory().getName());
        productDtoRes.setDescription(product.getDescription());
        return productDtoRes;
    }
}
