package com.sda.javaremote18.spring_boot.models.item;

import com.sda.javaremote18.spring_boot.utils.Utils;

import java.util.Date;

// Dto = Data Transfer Object
public class ItemDto {
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private Integer ownerId;
    private Integer categoryId;

    public boolean isValid() {
        int counter = 0;
        if(!Utils.isValidString(this.title) && !Utils.isValidString(this.description)) {//daca title nu este valid si descrierea nu este valida
            counter++;
        }
        if(Double.isNaN(this.price)) {  //isNaN verifica daca parametrul este numar
            counter++;
        }
        if(ownerId < 0) {
            counter++;
        }
        if(categoryId < 0){
            counter++;
        }
        return counter == 0;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
