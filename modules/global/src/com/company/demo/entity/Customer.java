package com.company.demo.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("C")
@NamePattern("%s|title")
@Table(name = "DEMO_CUSTOMER")
@Entity(name = "demo_Customer")
public class Customer extends StandardEntity {
    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @NotNull
    @Lob
    @Column(name = "ADDRESS", nullable = false)
    protected String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}