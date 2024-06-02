package org.openfeign.openfeign.controllers;


import org.openfeign.openfeign.clients.FakeStoreClient;
import org.openfeign.openfeign.clients.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  FakeStoreClient fakeStoreClient;

  @GetMapping("/{id}")
  public User getUser(@PathVariable ("id") Integer id) {
    return fakeStoreClient.getUser(id);
  }

}
