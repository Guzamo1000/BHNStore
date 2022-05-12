package BHNStore.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity

@Table(name="CartItems")
public class CartItem implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=20,columnDefinition = "int not null")
	private int quantity;
	private int isActive;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	@ManyToOne
	@JoinColumn(name="ProductId")
	private Product product;
	
}
