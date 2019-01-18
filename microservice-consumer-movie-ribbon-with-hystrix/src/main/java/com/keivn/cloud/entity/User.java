package com.keivn.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/7
 * @version 1.0
 */
public class User implements Serializable {

    private Long id;

    private String username;

    private String name;

    private Short age;

    private BigDecimal balance;

    public User() {
    }

    public User(Long id, String username, String name, Short age, BigDecimal balance) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
