package xyz.opcal.demo.service;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import xyz.opcal.demo.domain.doc.Event;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EventServiceTest {

	@Autowired
	EventService eventService;

	@Test
	@Order(0)
	void save() {
		Event event = new Event();
		event.setId(1L);
		event.setName("e:" + System.currentTimeMillis());
		event.setBeginDate(LocalDateTime.now());
		event.setEndDate(LocalDateTime.now().plusHours(3));
		assertDoesNotThrow(() -> log.info("event: {}", eventService.save(event)));
	}

	@Test
	@Order(1)
	void all() {
		assertNotNull(eventService.all());
	}

}
