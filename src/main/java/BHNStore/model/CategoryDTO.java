package BHNStore.model;



import java.io.Serializable;
//
//
//import javax.validation.constraints.NotEmpty;


public class CategoryDTO implements Serializable{
	
	private Long categoryId;
//	@NotEmpty
	private String name;
	
	private Boolean isEdit=false;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}
	
}
