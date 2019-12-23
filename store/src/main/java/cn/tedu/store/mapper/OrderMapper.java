package cn.tedu.store.mapper;

import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;

public interface OrderMapper {
    /**
     *插入订单
     * @param order 订单
     * @return 返受影响行数
     */
    Integer insertOrder(Order order);//这个order对象在运行完这条代码后会得到一个只增的oid

    /**
     * 插入订单数据和订单商品数据的持久层
     * @param orderItem 订单商品类
     * @return 返受影响行数
     */
    Integer insertOrderItem(OrderItem orderItem);

}
