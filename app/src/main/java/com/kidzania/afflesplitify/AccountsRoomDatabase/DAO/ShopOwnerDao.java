package com.kidzania.afflesplitify.AccountsRoomDatabase.DAO;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Owner;

import java.util.List;
@Dao
public interface ShopOwnerDao {
    @Insert
    void insert(Shop_Owner shop_owner);

    @Query("DELETE FROM shop_owner")
    void deleteAll();

    @Query("SELECT * from shop_owner")
    MutableLiveData<List<Shop_Owner>> getAllShopOwner();
}
