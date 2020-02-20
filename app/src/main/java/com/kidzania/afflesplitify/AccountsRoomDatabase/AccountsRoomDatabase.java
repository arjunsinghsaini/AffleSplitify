package com.kidzania.afflesplitify.AccountsRoomDatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.AccountsDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.ShopDetailsDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.ShopOwnerDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Accounts;
import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Details;
import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Owner;

@Database(entities = {Accounts.class, Shop_Details.class, Shop_Owner.class}, version = 1, exportSchema = false)
public abstract class AccountsRoomDatabase extends RoomDatabase {

    public abstract AccountsDao accountsDao();
    public abstract ShopDetailsDao shopDetailsDao();
    public abstract ShopOwnerDao shopOwnerDao();

    private static AccountsRoomDatabase INSTANCE;

    public static AccountsRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AccountsRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AccountsRoomDatabase.class, "word_database")
                            // Wipes and rebuilds instead of migrating
                            // if no Migration object.
                            // Migration is not part of this practical.
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
