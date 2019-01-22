package com.company.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("O")
@Entity(name = "demo_Company")
public class Company extends Customer {
    @Column(name = "PROFIT")
    protected Long profit;

    public Long getProfit() {
        return profit;
    }

    public void setProfit(Long profit) {
        this.profit = profit;
    }
}