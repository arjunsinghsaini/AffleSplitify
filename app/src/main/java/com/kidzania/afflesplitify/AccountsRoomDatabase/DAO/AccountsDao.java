package com.kidzania.afflesplitify.AccountsRoomDatabase.DAO;

import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Accounts;

import java.util.List;
@Dao
public interface AccountsDao {

    @Insert
    void insert(Accounts accounts);

    @Query("DELETE FROM accounts")
    void deleteAll();

    @Query("SELECT * from accounts")
    MutableLiveData<List<Accounts>> getAllAccounts();
}
