package com.trs.timereporting.domain.repository.impl;

import com.trs.timereporting.domain.repository.ProjectRepository;
import com.trs.timereporting.domain.Project;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by williamzappasodi on 1/10/16.
 */

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

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


    public List<Project> getAllProjects() {


        jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);



        String sql = "SELECT a.NAME, b.DESCRIPTION, " +
                "b.DUE_DATE, b.HOURS, " +
                "b.INVOICE_SENT, b.PROJECT_ID, " +
                "b.START_DATE " +
                "FROM CLIENTS a, PROJECTS b " +
                "WHERE a.CLIENT_ID = b.CLIENT_ID";


        List<Project> listOfClients = new ArrayList<Project>();


        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Project project = new Project();

            project.setDescription((String) row.get("DESCRIPTION"));
            project.setHours((String) row.get("HOURS"));
            project.setInvoiceSent((String) row.get("INVOICE_SENT"));
            project.setDueDate((String) row.get("DUE_DATE"));
            project.setStartDate((String) row.get("START_DATE"));
            project.setName((String) row.get("NAME"));
            project.setProjectId((Integer) row.get("PROJECT_ID"));
            project.setClientId((Integer) row.get("CLIENT_ID"));

            listOfClients.add(project);

        }

        return listOfClients;
    }


    @Override
    public Project create(Project project) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);


        String sql = "INSERT INTO PROJECTS "
                + "(CLIENT, DESCRIPTION, HOURS, START_DATE, DUE_DATE, INVOICE_SENT, CLIENT_ID) VALUES (?,?,?,?,?,?,?)";
        Object[] args = new Object[]{"Bogus", project.getDescription(),project.getHours(),
                project.getStartDate(),
                project.getDueDate() ,project.getInvoiceSent(),project.getClientId()
        };


        logger.info("sql {} ", sql);

        jdbcTemplate.update(
                sql, args);

        return project;
    }


}
