package com.test_6.Prouduct.repository;

import com.test_6.Prouduct.model.Prouduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Prouduct, Integer> {
    @Query(value = "SELECT * FROM product WHERE product_id = ?1", nativeQuery = true)
    Prouduct getProductById(Integer productId);
}