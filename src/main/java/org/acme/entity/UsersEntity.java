package org.acme.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsersEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String email;
  private String password;
  private String name;
  private String address;
  private String phone;
  private String avatar;
  private String role;

  public UsersEntity(Long id, String email, String password, String name, String address,
      String phone, String avatar, String role) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.avatar = avatar;
    this.role = role;
  }

  public UsersEntity(String email, String password, String name, String address, String phone,
      String avatar, String role) {
    this.email = email;
    this.password = password;
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.avatar = avatar;
    this.role = role;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}
