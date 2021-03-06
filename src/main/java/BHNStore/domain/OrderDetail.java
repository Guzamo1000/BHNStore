package BHNStore.domain;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDatailId;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private double unitprice;
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;
}
