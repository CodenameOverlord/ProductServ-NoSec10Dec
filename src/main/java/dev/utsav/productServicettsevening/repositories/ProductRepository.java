package dev.utsav.productServicettsevening.repositories;

import dev.utsav.productServicettsevening.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
