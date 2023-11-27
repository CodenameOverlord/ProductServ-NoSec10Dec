package dev.utsav.productServicettsevening.services;

//commenting for now, a lot of refactoring to do

//@Service
public class FakeStoreProductServiceImpl
//        implements ProductService


{
//    private RestTemplateBuilder restTemplateBuilder;
//
//    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){
//        this.restTemplateBuilder = restTemplateBuilder;
//    }
//
//    @Override
//    public List<Product> getAllProducts() {
//        RestTemplate restTemplate = restTemplateBuilder.build();
////        This cannot be done due to Type
////        ResponseEntity<List<Product>> l = restTemplate.getForEntity(
////                "https://fakestoreapi.com/products",
////                List<Product>.class);
////        Instead do this
//        ResponseEntity<ProductDtoRes[]> l = restTemplate.getForEntity(
//                "https://fakestoreapi.com/products",
//                ProductDtoRes[].class);
//        List<Product> returnList = new ArrayList<>();
//        for(ProductDtoRes productDto: l.getBody()){
//            Product product = new Product();
//            product.setId(productDto.getId());
//            product.setTitle(productDto.getTitle());
//            product.setPrice(productDto.getPrice());
//            Category category = new Category(productDto.getCategory(),null, null);
////            category.setName(productDto.getCategory());
//            product.setCategory(category);
//            product.setImageUrl(productDto.getImage());
//            returnList.add(product);
//        }
//        return returnList;
//    }
//
//    @Override
//    public Product getSingleProduct(Long productId) {
//        RestTemplate restTemplate = restTemplateBuilder.build();
//        ResponseEntity<ProductDtoRes> response = restTemplate.getForEntity(
//                "https://fakestoreapi.com/products/{productId}",
//                ProductDtoRes.class,
//                productId);
//        ProductDtoRes productDto = response.getBody();
//        Product product = new Product();
//        product.setTitle(productDto.getTitle());
//        Category cat = new Category(productDto.getCategory(), null, null);
//        product.setCategory(cat);
//        product.setDescription(productDto.getDescription());
//        product.setImageUrl(productDto.getImage());
//        product.setId(productDto.getId());
//        return product;
//    }
//
//    @Override
//    public Product addNewProduct(ProductDtoRes productDto) {
//        RestTemplate restTemplate = restTemplateBuilder.build();
//
//        ResponseEntity<ProductDtoRes> response = restTemplate.postForEntity(
//                "https://fakestoreapi.com/products",
//                productDto,
//                ProductDtoRes.class
//        );
//        ProductDtoRes productDtoReceived = response.getBody();
//        Product product = new Product();
//        product.setId(productDtoReceived.getId());
//        product.setPrice(productDtoReceived.getPrice());
//        product.setTitle(productDtoReceived.getTitle());
//        product.setImageUrl(productDtoReceived.getImage());
//        product.setDescription(productDtoReceived.getDescription());
//        product.setCategory(new Category(productDtoReceived.getCategory(), null, null));
//        return product;
//    }
//
//    @Override
//    public Product updateProduct(Long productId) {
//        return null;
//    }
//
//    @Override
//    public boolean deleteProduct(Long productId) {
//        return false;
//    }
}
