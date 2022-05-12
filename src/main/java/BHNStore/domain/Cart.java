package BHNStore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Carts")
public class Cart implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(columnDefinition = "Date not null")
	private Date dateAdded;
	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
	private Set<CartItem> CartItems;
}
