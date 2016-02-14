package com.trs.timereporting.domain.repository.impl;

import com.trs.timereporting.domain.Task;
import com.trs.timereporting.domain.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


       // String sql = "SELECT DESCRIPTION, HOURS, HOURS_ADDED, PROJECT_ID from TASKS;";


        String sql ="SELECT a.DESCRIPTION, a.HOURS, " +
                "a.HOURS_ADDED, b.DESCRIPTION AS PROJECTDESCRIPTION " +
                "FROM TASKS a, PROJECTS b  " +
                "WHERE a.PROJECT_ID = b.PROJECT_ID";

        List<Task> listOfTasks = new ArrayList<Task>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map row : rows) {
            Task task = new Task();

           task.setDescription((String) row.get("DESCRIPTION"));
            task.setHours((String) row.get("HOURS"));
            task.setHoursAdded((String) row.get("HOURS_ADDED"));
            task.setProjectDescription((String) row.get("PROJECTDESCRIPTION"));

            listOfTasks.add(task);

        }

        return listOfTasks;
    }


    @Override
    public Task create(Task task) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        logger.info("dataSource{} ", dataSource);

        String sql = "INSERT INTO TASKS "
                + "(PROJECT_ID, HOURS_ADDED, DESCRIPTION, HOURS) VALUES (?,?,?,?)";
        Object[] args = new Object[]{task.getProjectId(), task.getHoursAdded(), task.getDescription(), task.getHours()};


        logger.info("sql {} ", sql);

        jdbcTemplate.update(
                sql, args);

        return task;
    }


}
