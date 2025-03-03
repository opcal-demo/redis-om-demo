package xyz.opcal.demo.repository.hashes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xyz.opcal.demo.domain.hashes.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
