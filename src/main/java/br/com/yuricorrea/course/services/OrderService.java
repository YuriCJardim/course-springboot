package br.com.yuricorrea.course.services;

import br.com.yuricorrea.course.entities.Order;
import br.com.yuricorrea.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> FindAll(){
        return orderRepository.findAll();
    }

    public Order findById (Long id){
        Optional <Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
