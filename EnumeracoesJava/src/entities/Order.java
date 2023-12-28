package entities;

import java.util.Date;

import entities.enums.orderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private orderStatus status;
	
	public Order(Integer id, Date moment, orderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public orderStatus getStatus() {
		return status;
	}

	public void setStatus(orderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		return id + ", " + moment + ", " + status;
	}
}
