package com.zensar.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.zensar.entities.Order;
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insertOrder(Order order)
	{
		hibernateTemplate.save(order);		
	}

	public void updateOrder(Order order) 
	{
		hibernateTemplate.update(order);
	}

	public void deleteOrder(Order order) 
	{
		hibernateTemplate.delete(order);
	}

	public Order getByIdOrder(int orderId)
	{
		return hibernateTemplate.get(Order.class, orderId);
	}

	public List<Order> getAllOrder()
	{
		return hibernateTemplate.loadAll(Order.class);
	}

}
