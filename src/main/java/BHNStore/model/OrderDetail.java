package BHNStore.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class OrderDetail implements Serializable{
	private int orderDatailId;
	private int orderId;
	private int productId;
	private int quantity;
	private double unitprice;
}
