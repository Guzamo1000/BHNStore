package BHNStore.model;

import java.io.Serializable;


import org.springframework.web.multipart.MultipartFile;


public class ProductDTO implements Serializable{
	private Long productId;
//	@NotEmpty
	private String name;
//	@NotEmpty
	private int quantity;
//	@NotEmpty
	private double unitPrice;
//	@NotEmpty
	private String image;
	private MultipartFile imageFile;
	private String descrition;
//	@NotEmpty
	private String status;
//	@NotEmpty
	private Long categoryId;
//	@NotEmpty
	private int discount;
	private Boolean isEdit=false;
//	public Long getCategoryId() {
//		return categoryId;
//	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImageFile() {
		return imageFile;
	}
	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Boolean getIsEdit() {
		return isEdit;
	}
	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	
}
