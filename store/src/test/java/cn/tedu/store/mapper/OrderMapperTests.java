package cn.tedu.store.mapper;

import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTests {

	@Autowired
	OrderMapper orderMapepr;

	@Test
	public void inset(){
		Order order = new Order();
		order.setUid(1);
		order.setOid(1);
		order.setOrderTime(new Date());
		Integer i = orderMapepr.insertOrder(order);
		System.err.println(i);
	}
	@Test
	public void b(){
		OrderItem orderItem = new OrderItem();
		orderItem.setImage("jklsadf");
		orderItem.setOid(1);
		orderItem.setPid(2);
		orderItem.setTitle("sdajfkl");
		Integer integer = orderMapepr.insertOrderItem(orderItem);
		System.err.println(integer);
	}

}






