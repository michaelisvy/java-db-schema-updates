package org.samples.service;

import org.junit.jupiter.api.Test;
import org.samples.model.Address;
import org.samples.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;

import javax.transaction.Transactional;
import java.time.LocalDate;

@ActiveProfiles("test")
@SpringBootTest
class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test @Transactional @Rollback(false)
	void shouldCreateUser() {
		LocalDate dateOfBirth = LocalDate.of(1977, 8, 15);
		User user = new User("Bob", "Smith", dateOfBirth);
		Address address = new Address("9 Serangoon avenue 2", "556134", "Singapore");
		user.addAddress(address);
		this.userService.save(user);
	}
}
