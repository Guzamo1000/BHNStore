package BHNStore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class CartItem implements Serializable{
	private int id;
	private int userId;
	private int productId;
	private int quantity;
	private int cartId;
	private int isActive;
}
