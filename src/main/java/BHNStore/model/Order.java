package BHNStore.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class Order implements Serializable{
	
	private int orderId;
	private Date orderdate;
	private int userId;
	private double amount;
	private String status;
	private String adress;
	private String phone;
}
