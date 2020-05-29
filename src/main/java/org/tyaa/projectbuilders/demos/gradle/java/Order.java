package org.tyaa.projectbuilders.demos.gradle.java;

import java.util.Date;

public class Order {
    public Integer id;
    // ...
    public Date createdAt;

    public Order(Integer id, Date createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }
}
