/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylearning.ssapi.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Rajes
 */
@Entity
@Table(name = "DEMO_PRODUCT_INFO")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@JsonIgnoreProperties(value={"orderItems"})
public class Product implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 9172758196941643622L;

	@Id
    @Column(name = "PRODUCT_ID")
    private int id;
    
    @Column(name = "PRODUCT_NAME")
    private String name;
    
    @Column(name = "PRODUCT_DESCRIPTION")
    private String description;
    
    @Column(name = "CATEGORY")
    private String category;
    
    @Column(name = "PRODUCT_AVAIL") @Type(type="yes_no")
    private boolean available;
    
    @Column(name = "LIST_PRICE")
    private BigDecimal price;
    
    @Column(name = "PRODUCT_IMAGE")
    @Transient
    private Blob image;
    
    @Column(name = "MIMETYPE")
    private String mimeType;
    
    @Column(name = "FILENAME")
    private String fileName;
    
    @Column(name = "IMAGE_LAST_UPDATE")
    private Date lastUpdate;
    
    @OneToMany(mappedBy = "product")
    private List<OrderItems> orderItems = new ArrayList<OrderItems>();
    
    

	public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItems) {
        this.orderItems = orderItems;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    
    
    
    
}
