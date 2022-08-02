package org.acme.service;

import static org.acme.jooq.tables.Users.USERS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import org.acme.dto.UsersDTO;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import org.jooq.impl.DSL;

@Component
@Slf4j
public class UserService {

  public void getUsers() throws SQLException {
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/manage_hotel?autoReconnect=true", "root", "17102001abc!");
    DSLContext context = DSL.using(conn, SQLDialect.MYSQL);
    var result =  context.select().from(USERS);

//    var userDto = modelMapper.map(order, OrderDTO.class);

    System.out.println(2222);
    System.out.println(result);
  }


}
