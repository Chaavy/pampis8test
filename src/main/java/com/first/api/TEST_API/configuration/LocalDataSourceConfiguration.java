package com.first.api.TEST_API.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.logging.Logger;

import javax.sql.DataSource;

@Configuration
@Profile("default")
public class LocalDataSourceConfiguration {
    private static final Logger LOG = Logger.getLogger(LocalDataSourceConfiguration.class.getName());

    @Bean("DataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        LOG.info("Creating data source using spring.datasource ...");
        return DataSourceBuilder.create().build();
    }
}