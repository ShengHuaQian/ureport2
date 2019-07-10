package com.lxx.second.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 多数据源配置实体
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 17:12
 * @since JDK 1.8
 */
@Entity
public class DcStudent {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
