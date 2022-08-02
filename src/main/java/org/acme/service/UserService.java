package org.acme.service;

import static org.acme.jooq.tables.Users.USERS;

import java.sql.SQLException;
import java.util.List;
import org.acme.config.DSLContextConfig;
import org.acme.entity.Users;
import org.acme.jooq.tables.records.UsersRecord;

import org.springframework.stereotype.Service;

@Service
public class UserService extends DSLContextConfig {

  public UserService() throws SQLException {
    super();
  }

  public List<Users> getUsers(){
    return context.selectFrom(USERS)
        .fetch(row -> {
          return new Users((long) row.getId(), row.getEmail(), row.getPassword(), row.getName(), row.getAddress(),
              row.getPhone(), row.getAvatar(), row.getRole());
        });
  }

  public Users getUser(Long id) {
    UsersRecord row =  context.selectFrom(USERS).where(USERS.ID.eq(id.intValue())).fetchOne();

    return new Users((long) row.getId(), row.getEmail(), row.getPassword(), row.getName(), row.getAddress(),
        row.getPhone(), row.getAvatar(), row.getRole());
  }

//  public Users createUser(Users user) {
//    var row = context.insertInto(USERS,
//        USERS.NAME, USERS.EMAIL, USERS.PASSWORD, USERS.ADDRESS USERS.PHONE)
//        .values(user.getName(),user.getEmail(), user.getPassword(), user.getAddress(), user.getPhone())
//        .execute();
//  }
}
