package com.example.doanh.pks;


import com.example.doanh.models.Order;
import com.example.doanh.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
