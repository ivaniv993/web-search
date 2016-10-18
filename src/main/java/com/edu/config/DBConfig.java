package com.edu.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.PostgreSQL81Dialect;
import org.hibernate.dialect.PostgreSQL9Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaDialect;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by xXx on 10/4/2016.
 */
@Configuration
@EnableJpaRepositories("com.edu")
@EnableTransactionManagement
public class DBConfig {


//    @Bean
//    @Primary
//    public DataSource dataSource() {
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        DataSource dataSource= builder
//                .addScript("db/schema.sql")
//                .addScript("db/data.sql")
//                .setType(EmbeddedDatabaseType.H2)
//                .build();
//        return dataSource;
//    }

    @Autowired
    private DataSource dataSource;

    @Bean
    @Autowired
    public EntityManagerFactory entityManagerFactory( DataSource dataSource ) {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);
        vendorAdapter.setShowSql(true);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQL9Dialect");
        Map<String, Object> configuration = vendorAdapter.getJpaPropertyMap();
//        configuration.put("hibernate.hbm2ddl.auto", "update");

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.edu");
        factory.setDataSource(dataSource);

        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    @Autowired
    public PlatformTransactionManager transactionManager( EntityManagerFactory entityManagerFactory) {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

}
