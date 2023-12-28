package applications;

import java.util.Date;

import entities.Order;
import entities.enums.orderStatus;

public class enumeracoes {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), orderStatus.PENDING_PAYMENTS);
		System.out.println(order);
		
		orderStatus os1 = orderStatus.DELIVERED;
		orderStatus os2 = orderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
