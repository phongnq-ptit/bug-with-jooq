package org.acme.dto;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsersDTO {
  private String email;
  private String password;
  private String address;
  private String phone;
}
