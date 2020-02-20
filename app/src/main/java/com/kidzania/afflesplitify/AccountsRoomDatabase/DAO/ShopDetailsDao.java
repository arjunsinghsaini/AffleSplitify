package com.kidzania.afflesplitify.AccountsRoomDatabase.DAO;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Details;

import java.util.List;
@Dao
public interface  ShopDetailsDao {

    @Insert
    void insert(Shop_Details shop_details);

    @Query("DELETE FROM shop_details")
    void deleteAll();

    @Query("SELECT * from shop_details")
    MutableLiveData<List<Shop_Details>> getAllShopDetails();
}
