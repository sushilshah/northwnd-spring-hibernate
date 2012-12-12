package com.aaronhible.model.views;
// Generated Dec 12, 2012 8:51:28 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * OrdersQryId generated by hbm2java
 */
public class OrdersQryId  implements java.io.Serializable {


     private int orderId;
     private String customerId;
     private Integer employeeId;
     private Date orderDate;
     private Date requiredDate;
     private Date shippedDate;
     private Integer shipVia;
     private BigDecimal freight;
     private String shipName;
     private String shipAddress;
     private String shipCity;
     private String shipRegion;
     private String shipPostalCode;
     private String shipCountry;
     private String companyName;
     private String address;
     private String city;
     private String region;
     private String postalCode;
     private String country;

    public OrdersQryId() {
    }

    public OrdersQryId(int orderId, String customerId, Integer employeeId, Date orderDate, Date requiredDate, Date shippedDate, Integer shipVia, BigDecimal freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry, String companyName, String address, String city, String region, String postalCode, String country) {
       this.orderId = orderId;
       this.customerId = customerId;
       this.employeeId = employeeId;
       this.orderDate = orderDate;
       this.requiredDate = requiredDate;
       this.shippedDate = shippedDate;
       this.shipVia = shipVia;
       this.freight = freight;
       this.shipName = shipName;
       this.shipAddress = shipAddress;
       this.shipCity = shipCity;
       this.shipRegion = shipRegion;
       this.shipPostalCode = shipPostalCode;
       this.shipCountry = shipCountry;
       this.companyName = companyName;
       this.address = address;
       this.city = city;
       this.region = region;
       this.postalCode = postalCode;
       this.country = country;
    }
   
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Date getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Date getRequiredDate() {
        return this.requiredDate;
    }
    
    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }
    public Date getShippedDate() {
        return this.shippedDate;
    }
    
    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
    public Integer getShipVia() {
        return this.shipVia;
    }
    
    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }
    public BigDecimal getFreight() {
        return this.freight;
    }
    
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
    public String getShipName() {
        return this.shipName;
    }
    
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
    public String getShipAddress() {
        return this.shipAddress;
    }
    
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    public String getShipCity() {
        return this.shipCity;
    }
    
    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }
    public String getShipRegion() {
        return this.shipRegion;
    }
    
    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }
    public String getShipPostalCode() {
        return this.shipPostalCode;
    }
    
    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }
    public String getShipCountry() {
        return this.shipCountry;
    }
    
    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }




}

