package xyz.opcal.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import xyz.opcal.demo.domain.doc.Event;
import xyz.opcal.demo.repository.documents.EventRepository;

@Service
public class EventService {

	private final EventRepository eventRepository;

	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}

	public Event save(Event event) {
		return eventRepository.save(event);
	}

	public List<Event> all() {
		return eventRepository.findAll();
	}
}
