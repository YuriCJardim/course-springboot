package br.com.yuricorrea.course.repositories;

import br.com.yuricorrea.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}


