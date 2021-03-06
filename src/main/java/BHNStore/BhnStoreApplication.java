package BHNStore;


import com.github.messenger4j.Messenger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import BHNStore.config.StorageProperties;
import BHNStore.service.StorageService;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class BhnStoreApplication {
	@Bean
	public Messenger messenger(@Value("${messenger4j.pageAccessToken}") String pageAccessToken,
 @Value("${messenger4j.appSecret}") final String appSecret,
 @Value("${messenger4j.verifyToken}") final String verifyToken) {
        return Messenger.create(pageAccessToken, appSecret, verifyToken);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(BhnStoreApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args->{
			storageService.init();
		});
	}
	

}
