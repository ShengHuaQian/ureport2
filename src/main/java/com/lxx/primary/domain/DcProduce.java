package com.lxx.primary.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 9:48
 * @since JDK 1.8
 */
@Entity
public class DcProduce {

    @Id
    @GeneratedValue
    private Long id;

    private String type;

    private String name;

    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
