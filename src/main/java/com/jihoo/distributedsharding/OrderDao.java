package com.jihoo.distributedsharding;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDao extends JpaRepository<OrderEntity, Long> {

    OrderEntity findByOrderId(Long orderId);

    List<OrderEntity> findByUserId(Integer userId);

    List<OrderEntity> findByUserIdAndOrderId(Integer userId,Long orderId);
}
