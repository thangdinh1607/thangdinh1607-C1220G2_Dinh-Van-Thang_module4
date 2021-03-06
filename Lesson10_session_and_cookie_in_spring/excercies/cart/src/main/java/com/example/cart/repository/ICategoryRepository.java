package com.example.cart.repository;

import com.example.cart.model.Category;
import com.example.cart.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    Page<Category> findAll(Pageable pageable);
}
