package dev.utsav.productServicettsevening.services;

import dev.utsav.productServicettsevening.dtos.ProductDto;
import dev.utsav.productServicettsevening.models.Category;
import dev.utsav.productServicettsevening.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<Product> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
//        This cannot be done due to Type
//        ResponseEntity<List<Product>> l = restTemplate.getForEntity(
//                "https://fakestoreapi.com/products",
//                List<Product>.class);
//        Instead do this
        ResponseEntity<ProductDto[]> l = restTemplate.getForEntity(
                "https://fakestoreapi.com/products",
                ProductDto[].class);
        List<Product> returnList = new ArrayList<>();
        for(ProductDto productDto: l.getBody()){
            Product product = new Product();
            product.setId(productDto.getId());
            product.setTitle(productDto.getTitle());
            product.setPrice(productDto.getPrice());
            Category category = new Category(productDto.getCategory(),null, null);
//            category.setName(productDto.getCategory());
            product.setCategory(category);
            product.setImageUrl(productDto.getImage());
            returnList.add(product);
        }
        return returnList;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<ProductDto> response = restTemplate.getForEntity(
                "https://fakestoreapi.com/products/{productId}",
                ProductDto.class,
                productId);
        ProductDto productDto = response.getBody();
        Product product = new Product();
        product.setTitle(productDto.getTitle());
        Category cat = new Category(productDto.getCategory(), null, null);
        product.setCategory(cat);
        product.setDescription(productDto.getDescription());
        product.setImageUrl(productDto.getImage());
        product.setId(productDto.getId());
        return product;
    }

    @Override
    public Product addNewProduct(ProductDto productDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<ProductDto> response = restTemplate.postForEntity(
                "https://fakestoreapi.com/products",
                productDto,
                ProductDto.class
        );
        ProductDto productDtoReceived = response.getBody();
        Product product = new Product();
        product.setId(productDtoReceived.getId());
        product.setPrice(productDtoReceived.getPrice());
        product.setTitle(productDtoReceived.getTitle());
        product.setImageUrl(productDtoReceived.getImage());
        product.setDescription(productDtoReceived.getDescription());
        product.setCategory(new Category(productDtoReceived.getCategory(), null, null));
        return product;
    }

    @Override
    public Product updateProduct(Long productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
