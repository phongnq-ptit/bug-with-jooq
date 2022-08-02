package org.acme.controller;

import org.acme.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.acme.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<Users> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/{id}")
  public Users getUser(@PathVariable("id") Long id) {
    return userService.getUser(id);
  }


}
