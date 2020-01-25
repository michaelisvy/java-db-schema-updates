package org.samples.service;

import org.samples.model.User;
import org.samples.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return this.userRepository.findById(id).get();
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }
}
