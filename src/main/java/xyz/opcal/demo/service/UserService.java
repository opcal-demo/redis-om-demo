package xyz.opcal.demo.service;

import org.springframework.stereotype.Service;

import xyz.opcal.demo.domain.hashes.User;
import xyz.opcal.demo.repository.hashes.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public Iterable<User> all() {
		return userRepository.findAll();
	}
}
