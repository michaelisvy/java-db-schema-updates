package org.samples.web;

import org.samples.model.User;
import org.samples.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public ResponseEntity<User> findUser(@PathVariable Integer id) {
        return ResponseEntity.ok().body(this.userService.findById(id));
    }


}
