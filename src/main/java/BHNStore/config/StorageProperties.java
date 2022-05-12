package BHNStore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;



@ConfigurationProperties("storage")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class StorageProperties {
	private String location;
	public StorageProperties() {
		// TODO Auto-generated constructor stub
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

	


	
	
}
