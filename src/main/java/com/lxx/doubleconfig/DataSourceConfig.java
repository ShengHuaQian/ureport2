package com.lxx.doubleconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 多数据源配置
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 16:35
 * @since JDK 1.8
 */
@Configuration
public class DataSourceConfig {

    /**
     * 多数据源时必须指定一个数据源为@Primary
     *
     * @return 数据源配置信息
     */
    @Bean(name = "primaryDataSourceProp")
    @Qualifier("primaryDataSourceProp")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSourceProperties primaryDataSourceProp() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource() {
        return primaryDataSourceProp().initializeDataSourceBuilder().build();
    }

    @Bean(name = "secondDataSourceProp")
    @Qualifier("secondDataSourceProp")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSourceProperties secondDataSourceProp() {
        return new DataSourceProperties();
    }

    @Bean(name = "secondDataSource")
    @Qualifier("secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSource secondDataSource() {
        return secondDataSourceProp().initializeDataSourceBuilder().build();
    }
}
