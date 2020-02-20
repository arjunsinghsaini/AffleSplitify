package com.kidzania.afflesplitify.AccountsRoomDatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shop_owner")
public class Shop_Owner{


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "shop_id")
    private String shop_id;
    @NonNull
    @ColumnInfo(name = "name")
    private String name;
    @NonNull
    @ColumnInfo(name = "address")
    private String address;
    @NonNull
    @ColumnInfo(name = "phone")
    private String phone;
    @NonNull
    @ColumnInfo(name = "country_code")
    private String country_code;
    @NonNull
    @ColumnInfo(name = "email_id")
    private String email_id;
    @NonNull
    @ColumnInfo(name = "image")
    private String image;

    public Shop_Owner(@NonNull String shop_id,@NonNull String name,@NonNull String address,@NonNull String phone,@NonNull String country_code,@NonNull String email_id,@NonNull String image) {
        this.shop_id = shop_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.country_code = country_code;
        this.email_id = email_id;
        this.image = image;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}