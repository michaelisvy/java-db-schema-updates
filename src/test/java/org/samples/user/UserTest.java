package org.samples.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;
import java.time.LocalDate;

@SpringBootTest @ActiveProfiles("mysql")
class UserTest {

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
