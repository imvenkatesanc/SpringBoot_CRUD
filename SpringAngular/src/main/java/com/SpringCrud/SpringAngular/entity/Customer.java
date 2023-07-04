package com.SpringCrud.SpringAngular.entity;

import javax.persistence.*;
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="customer_id", length=50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cutomerid;
    @Column(name="customer_name", length=50)
    private String customername;
    @Column(name="customer_address", length=60)
    private String customeraddress;
    @Column(name="mobile", length=12)
    private int mobile;

    public Customer(int cutomerid, String customername, String customeraddress, int mobile) {
        this.cutomerid = cutomerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public Customer(String customername, String customeraddress, int mobile) {
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public int getCutomerid() {
        return cutomerid;
    }

    public void setCutomerid(int cutomerid) {
        this.cutomerid = cutomerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cutomerid=" + cutomerid +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

