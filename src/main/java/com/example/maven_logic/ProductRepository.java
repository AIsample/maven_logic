package com.example.maven_logic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductRepositoryインターフェースは、商品情報のデータアクセスを提供します。
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}