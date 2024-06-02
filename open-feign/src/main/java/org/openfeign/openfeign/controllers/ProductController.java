package org.openfeign.openfeign.controllers;


import org.openfeign.openfeign.clients.FakeStoreClient;
import org.openfeign.openfeign.clients.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/produtos")
@RestController
public class ProductController {

  @Autowired
  FakeStoreClient fakeStoreClient;

  @GetMapping()
  public List<Product> getProducts() {
    return fakeStoreClient.getProducts();
  }

  @GetMapping("/{id}")
  public Product getProduct(@PathVariable("id") Double id) {
    return fakeStoreClient.getProduct(id);
  }

}
