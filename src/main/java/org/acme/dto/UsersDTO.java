package org.acme.dto;
import lombok.Builder;
import lombok.Data;

//@Builder
//@Data
public class UsersDTO {
  private String email;
  private String password;
  private String address;
  private String phone;

  public UsersDTO() {
  }

  public UsersDTO(String email, String password, String address, String phone) {
    this.email = email;
    this.password = password;
    this.address = address;
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
