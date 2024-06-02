package org.openfeign.openfeign.clients;

import com.fasterxml.jackson.databind.ObjectMapper;

public record User(
  Double id,
  String email,
  String username,
  String phone,
  NameDTO name,
  AddressDTO address
) {

  public record NameDTO (
    String firstname,
    String lastname
  ) {}

  public record AddressDTO(
    String city,
    String street,
    Integer number,
    String zipcode
  ) {}

  public static User fromJSON(String json) {
    try {
      ObjectMapper mapper = new ObjectMapper();
      return mapper.readValue(json, User.class);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }


}