package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.exception.ResourceNotFoundException;
import com.proiect.Coffee_Shop.model.Order;
import com.proiect.Coffee_Shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository)
    {
        super();
        this.orderRepository = orderRepository;
    }
    @Override
    public Order saveOrder(Order order) {

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(int id) {

        orderRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product", "id", id));
        orderRepository.deleteById(id);
    }
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }


}