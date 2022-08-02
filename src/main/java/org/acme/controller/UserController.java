package org.acme.controller;

import static org.acme.jooq.tables.Users.USERS;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.dto.UsersDTO;
import org.acme.entity.UsersEntity;
import org.acme.service.UserService;
import org.jooq.DSLContext;

@Path("/api/users")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class UserController {
  @Autowired UserService userService;

  @GET
  public void getUsers() throws SQLException {
    System.out.println(111111);
    userService.getUsers();
//    dsl.select()
//        .from(USERS)
//        .fetchInto(UsersDTO.class);
  }
}
