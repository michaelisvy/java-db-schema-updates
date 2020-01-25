package org.samples.repository;

import org.junit.jupiter.api.Test;
import org.samples.model.Address;
import org.samples.model.User;
import org.samples.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.time.LocalDate;

@SpringBootTest
class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test @Transactional @Rollback(false)
	void shouldCreateUser() {
		LocalDate dateOfBirth = LocalDate.of(1977, 8, 15);
		User user = new User("Bob", "Smith", dateOfBirth);
		Address address = new Address("9 Serangoon avenue 2", "556134", "Singapore");
		user.addAddress(address);
		this.userRepository.save(user);
	}
}
