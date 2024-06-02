package org.openfeign.openfeign.clients;

public record Product(
  Double id,
  String title,
  Double price,
  String category,
  String description,
  String image
) {
}
