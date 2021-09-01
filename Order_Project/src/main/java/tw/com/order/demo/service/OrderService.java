package tw.com.order.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tw.com.order.demo.entities.Order;

@Service
public interface OrderService {

	// 列出完整訂單
	List<Order> getAllOrder();

	// 儲存訂單
	void saveOrder(Order order);

	// 取得訂單資料
//	Order getOrderByOrderNumber(String id) ;

	// 刪除訂單
	void deleteOrder(String orderId);

	// 自動生成訂單編號
	String orderId();

	// 搜尋單一訂單編號
	Order getOrderById(String orderId);

}
