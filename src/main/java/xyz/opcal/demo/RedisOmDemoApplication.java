package xyz.opcal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;

@EnableRedisEnhancedRepositories(value = {"xyz.opcal.demo.repository.hashes"})
@EnableRedisDocumentRepositories(value = {"xyz.opcal.demo.repository.documents"})
@SpringBootApplication
public class RedisOmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisOmDemoApplication.class, args);
	}

}
