package com.kidzania.afflesplitify.AccountsRoomDatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shop_details" )
public class Shop_Details {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "shop_details_id")
    private String shop_details_id;
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
    @ColumnInfo(name = "email_id")
    private String email_id;

    public Shop_Details(@NonNull String shop_details_id,@NonNull String name,@NonNull String address,@NonNull String phone,@NonNull String email_id) {
        this.shop_details_id = shop_details_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email_id = email_id;
    }

    public String getShop_details_id() {
        return shop_details_id;
    }

    public void setShop_details_id(String shop_details_id) {
        this.shop_details_id = shop_details_id;
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

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
