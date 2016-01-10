package com.trs.timereporting.domain.repository.impl;

import com.trs.timereporting.domain.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.trs.timereporting.domain.repository.ClientRepository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by williamzappasodi on 1/1/16.
 */
@Repository
public class ClientRepositoryImpl implements ClientRepository {


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


    public List<Client> getAllClients() {


        jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);


        String sql = "SELECT * FROM CLIENTS";
        List<Client> listOfClients = new ArrayList<Client>();


        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Client client = new Client();
            client.setAddress((String) (row.get("ADDRESS")));
            client.setName((String) row.get("NAME"));

            listOfClients.add(client);

        }

        return listOfClients;
    }


    @Override
    public Client create(Client client) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);

        String sql = "INSERT INTO CLIENTS "
                + "(NAME,ADDRESS) VALUES (?, ?)";
        Object[] args = new Object[]{client.getName(), client.getAddress()
        };

        jdbcTemplate.update(
                sql, args);

        return client;
    }


}
