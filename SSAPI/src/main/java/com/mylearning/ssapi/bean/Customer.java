/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearning.ssapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Rajes d
 */
@Entity
@Table(name = "DEMO_CUSTOMERS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@JsonIgnoreProperties(value={"orders"})
public class Customer implements Serializable {
    
    /**
	 */
	private static final long serialVersionUID = -1359841657571894089L;

	@Id @Column(name = "CUSTOMER_ID")
    private int id;
    
    @Column(name = "CUST_FIRST_NAME")
    private String firstName;
    
    @Column(name = "CUST_LAST_NAME")
    private String lastName;
    
    @Column(name = "CUST_STREET_ADDRESS1")
    private String streetAddress1;
    
    @Column(name = "CUST_STREET_ADDRESS2")
    private String streetAddress2;
    
    @Column(name = "CUST_CITY")
    private String city;
    
    @Column(name = "CUST_STATE")
    private String state;
    
    @Column(name = "CUST_POSTAL_CODE")
    private String postalCode;
    
    @Column(name = "PHONE_NUMBER1")
    private String phoneNumber1;
    
    @Column(name = "PHONE_NUMBER2")
    private String phoneNumber2;
    
    @Column(name = "CREDIT_LIMIT")
    private BigDecimal creditLimit;
    
    @Column(name = "CUST_EMAIL")
    private String email;
    
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)
    private Set<Order> orders = new HashSet<Order>();
    
    
	public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
