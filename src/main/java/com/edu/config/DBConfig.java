package com.edu.config;

import org.springframework.boot.autoconfigure.jdbc.EmbeddedDataSourceConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by xXx on 10/4/2016.
 */
@Configuration
@EnableJpaRepositories("com.edu.service")
@EnableTransactionManagement
public class DBConfig {

    @Bean
    public DataSource dataSource() {

        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        DataSource dataSource= builder
                .addScript("db/schema.sql")
                .addScript("db/data.sql")
                .setType(EmbeddedDatabaseType.H2)
                .build();
        try {
            Statement state = dataSource.getConnection().createStatement();
            state.execute("select * from contact");
            ResultSet resultSet = state.getResultSet();

            while (resultSet.next()){
                System.out.println("result "+ resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataSource;


    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
////        factory.setPackagesToScan("com.acme.domain");
//        factory.setDataSource(dataSource());
////        factory.afterPropertiesSet();
//
//        return factory.getObject();
//    }

//    @Bean
//    public PlatformTransactionManager transactionManager() {
//
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(entityManagerFactory());
//        return txManager;
//    }

}
