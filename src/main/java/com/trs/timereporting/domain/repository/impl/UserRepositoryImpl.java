package com.trs.timereporting.domain.repository.impl;

import com.trs.timereporting.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.trs.timereporting.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by williamzappasodi on 12/29/15.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    final static Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
   @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
       this.jdbcTemplate = jdbcTemplate;
   }


@Override
    public User create(User user) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    logger.info("dataSource{} ", dataSource);


        String sql = "INSERT INTO USERS "
                + "(FIRST_NAME,LAST_NAME, PASS_WORD, USER_NAME) VALUES (?, ?, ?,?)";
        Object[] args = new Object[] {user.getFirstName(), user.getLastName(),
                user.getPassWord(), user.getUserName()};


      jdbcTemplate.update(
              sql,args);


        return user;
    }

}
