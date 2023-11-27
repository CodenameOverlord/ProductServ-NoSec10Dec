package dev.utsav.productServicettsevening.repositories;

import dev.utsav.productServicettsevening.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
