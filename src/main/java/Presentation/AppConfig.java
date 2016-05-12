package Presentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;

import javax.sql.DataSource;


/**
 * Created by Андрей on 27.04.2016.
 */
@Configuration
@ComponentScan("java")
public class AppConfig {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    @Bean
    public void setJdbcConfig(){
        // create a JdbcTemplate and set data source
        this.jdbcTemplate = new JdbcTemplate();
        this.jdbcTemplate.setDataSource(this.dataSource());
    }

    @Bean
    public DataSource dataSource() {

        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("");
        dataSource.setPassword("root");

        return dataSource;
    }
}
