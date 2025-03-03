package xyz.opcal.demo.repository.documents;

import com.redis.om.spring.repository.RedisDocumentRepository;

import xyz.opcal.demo.domain.doc.Event;

public interface EventRepository extends RedisDocumentRepository<Event, Long> {

}
