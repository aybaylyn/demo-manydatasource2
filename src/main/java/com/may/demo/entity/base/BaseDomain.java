package com.may.demo.entity.base;

import java.io.Serializable;

/**
 * Created by May on 3/3/17.
 *
 * 实体类的基类
 */
public class BaseDomain implements Serializable {

    private static final long serialVersionUID = 4436523447094900879L;
    private Long id ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
