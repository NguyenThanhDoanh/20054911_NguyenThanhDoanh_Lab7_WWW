package com.example.doanh.repositories;

import com.example.doanh.models.OrderDetail;
import com.example.doanh.pks.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}