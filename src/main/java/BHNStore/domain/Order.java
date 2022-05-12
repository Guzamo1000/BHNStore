package BHNStore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Orders")
public class Order implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Temporal(TemporalType.DATE)
	private Date orderdate;
	@Column(nullable = false)
	private double amount;
	@Column(nullable = true)
	private String status;
	@Column(nullable = false)
	private String adress;
	@Column(nullable = true)
	private String phone;
	@OneToMany(mappedBy = "order")
	private Set<OrderDetail> orderDetails;
	@ManyToOne
	@JoinColumn(name="acountId")
	private Account account;
}
