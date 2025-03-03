package xyz.opcal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import com.redis.om.spring.annotations.EnableRedisEnhancedRepositories;

@EnableRedisEnhancedRepositories(basePackages = {"xyz.opcal.demo.repository.hashes", "xyz.opcal.demo.domain.hashes"})
@EnableRedisDocumentRepositories(basePackages = {"xyz.opcal.demo.repository.documents", "xyz.opcal.demo.domain.doc"})
@SpringBootApplication
public class RedisOmDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisOmDemoApplication.class, args);
	}

}
