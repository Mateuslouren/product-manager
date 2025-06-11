package com.github.mateuslouren.productmanager.repository;

import com.github.mateuslouren.productmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
