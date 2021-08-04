package com.example.model.Entity;

import com.example.model.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate; //주문 날짜

    @Enumerated(EnumType.STRING)
    private OrderStatus status; //주문 상태
}
