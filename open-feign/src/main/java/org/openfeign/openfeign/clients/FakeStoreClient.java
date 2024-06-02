package org.openfeign.openfeign.clients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://fakestoreapi.com/", name = "fake-store")
public interface FakeStoreClient {

  @GetMapping("products/{id}")
  Product getProduct(@PathVariable("id") Double id);

  @GetMapping("products")
  List<Product> getProducts();

  @GetMapping("/users/{id}")
  User getUser(@PathVariable("id") Integer id);

}
