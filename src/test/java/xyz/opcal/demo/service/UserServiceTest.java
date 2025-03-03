package xyz.opcal.demo.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import xyz.opcal.demo.domain.hashes.User;

@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	@Order(0)
	void save() {
		User user = new User();
		user.setId(1L);
		var t = System.currentTimeMillis();
		user.setFirstName("TF" + t);
		user.setLastName("TL" + t);
		user.setEmail("TF" + t + "@t.com");
		assertDoesNotThrow(() -> log.info("user: {}", userService.save(user)));
	}

	@Test
	@Order(1)
	void all() {
		assertNotNull(userService.all());
	}

}
