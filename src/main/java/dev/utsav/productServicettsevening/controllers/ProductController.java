package dev.utsav.productServicettsevening.controllers;

import dev.utsav.productServicettsevening.client.authenticationClient.AuthenticationClient;
import dev.utsav.productServicettsevening.client.authenticationClient.dtos.TokenResponseDto;
import dev.utsav.productServicettsevening.client.authenticationClient.dtos.UserResDto;
import dev.utsav.productServicettsevening.dtos.ProductDtoReq;
import dev.utsav.productServicettsevening.dtos.ProductDtoRes;
import dev.utsav.productServicettsevening.models.Product;
import dev.utsav.productServicettsevening.services.ProductService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    AuthenticationClient authenticationClient;
    @Autowired
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

//  Only allow admin to fetch all products
    @GetMapping("")
    public ResponseEntity<List<ProductDtoRes>> getAllProducts(@Nullable @RequestParam("AUTH_TOKEN")  String token) throws Exception {
        if(token == null){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

        Optional<TokenResponseDto> tokenResponseDtoOptional = authenticationClient.validate(token);
        if(tokenResponseDtoOptional.isEmpty()){
        throw new Exception("unauthorized");
        }
        TokenResponseDto tokenResponseDto = tokenResponseDtoOptional.get();
        UserResDto userResDto = tokenResponseDto.getUserResDto();
        List<String> roles = userResDto.getRoles();
        for(String role: roles){
            if("ADMIN".equals(role)){
                return this.productService.getAllProducts();
            }
        }

        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//        ResponseEntity<List<Product>> res = new ResponseEntity<>(
//                this.productService.getAllProducts(), HttpStatus.OK
//        );
//        return res;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> getSingleProduct(@PathVariable("productId") Long productId) {
        Optional<ProductDtoRes> productDtoResOptional = this.productService.getSingleProduct(productId);
        if(productDtoResOptional.isEmpty()){
            return  new ResponseEntity<>(
                    "no such product found", HttpStatus.BAD_REQUEST
            );
        }
        ResponseEntity<ProductDtoRes> response = new ResponseEntity<>(
                productDtoResOptional.get(), HttpStatus.OK
        );
        return response;
    }

    @PostMapping("")
    public ResponseEntity<ProductDtoRes> addNewProduct(@RequestBody ProductDtoReq productDtoReq){
        ProductDtoRes product = this.productService.addNewProduct(productDtoReq);
        ResponseEntity<ProductDtoRes> response = new ResponseEntity<>(product,
                HttpStatus.CREATED);
        return response;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@RequestBody ProductDtoRes productDtoRes){
        return "updating product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable ("productId") Long productId){
        return "deleting Product with prodId"+productId;
    }
}
