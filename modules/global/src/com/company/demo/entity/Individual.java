package com.company.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("I")
@Entity(name = "demo_Individual")
public class Individual extends Customer {
    @Column(name = "PASSPORT")
    protected String passport;

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}