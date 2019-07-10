package com.lxx.doubleconfig;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 内置数据源(ureport选择使用)
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 16:33
 * @since JDK 1.8
 */
@Component
public class TestBuildinDatasource implements BuildinDatasource {

    @Autowired
    @Qualifier(value = "secondDataSource")
    private DataSource secondDataSource;

    @Override
    public String name() {
        return "自定义内置数据源";
    }

    @Override
    public Connection getConnection() {
        try {
            return secondDataSource.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
