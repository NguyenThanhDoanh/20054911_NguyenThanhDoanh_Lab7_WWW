package com.example.doanh.repositories;

import com.example.doanh.models.ProductPrice;
import com.example.doanh.pks.ProductPricePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, ProductPricePK> {
}