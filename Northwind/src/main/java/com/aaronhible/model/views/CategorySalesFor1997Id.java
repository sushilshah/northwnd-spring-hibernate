package com.aaronhible.model.views;
// Generated Dec 12, 2012 8:51:28 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;

/**
 * CategorySalesFor1997Id generated by hbm2java
 */
public class CategorySalesFor1997Id  implements java.io.Serializable {


     private String categoryName;
     private BigDecimal categorySales;

    public CategorySalesFor1997Id() {
    }

    public CategorySalesFor1997Id(String categoryName, BigDecimal categorySales) {
       this.categoryName = categoryName;
       this.categorySales = categorySales;
    }
   
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public BigDecimal getCategorySales() {
        return this.categorySales;
    }
    
    public void setCategorySales(BigDecimal categorySales) {
        this.categorySales = categorySales;
    }




}

