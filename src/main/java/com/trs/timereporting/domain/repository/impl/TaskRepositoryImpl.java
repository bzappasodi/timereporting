package com.trs.timereporting.domain.repository.impl;

import com.trs.timereporting.domain.Task;
import com.trs.timereporting.domain.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by williamzappasodi on 1/18/16.
 */
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    final static Logger logger = LoggerFactory.getLogger(TaskRepositoryImpl.class);

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


    public List<Task> getAllTasks() {


        jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);


        return null;
        //return listOfTasks;
    }


    @Override
    public Task create(Task task) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);


        return task;
    }


}
