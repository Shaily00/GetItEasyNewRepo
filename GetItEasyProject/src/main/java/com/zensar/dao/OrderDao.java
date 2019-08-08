package com.zensar.dao;
import java.util.List;
import com.zensar.entities.Order;
public interface OrderDao {
	void insertOrder(Order order);
	void updateOrder(Order order);
	void deleteOrder(Order order);
	Order getByIdOrder(int orderId);
	List<Order> getAllOrder(); 
}
