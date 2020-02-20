package com.kidzania.afflesplitify.Repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;

import com.kidzania.afflesplitify.AccountsRoomDatabase.AccountsRoomDatabase;
import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.AccountsDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.ShopDetailsDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.ShopOwnerDao;
import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Owner;

import java.util.List;

public class ShopOwnerRepository {


    private ShopOwnerDao mShopOwnerDao;
    MutableLiveData<List<Shop_Owner>> mAllShopOwner;

    ShopOwnerRepository(Application application){
        AccountsRoomDatabase db = AccountsRoomDatabase.getDatabase(application);
        mShopOwnerDao = db.shopOwnerDao();
        mAllShopOwner = mShopOwnerDao.getAllShopOwner();
    }

    public MutableLiveData<List<Shop_Owner>> getAllShopOwner() {
        return mAllShopOwner;
    }

    public void insert(Shop_Owner shop_owner){
        new insertAsyncTask(mShopOwnerDao).execute(shop_owner);
    }

    private static class insertAsyncTask extends AsyncTask<Shop_Owner, Void , Void>{

        private ShopOwnerDao mAsyncTaskDao;

        insertAsyncTask(ShopOwnerDao dao){
            mAsyncTaskDao = dao;
        }

        @Override
        protected  Void doInBackground(final Shop_Owner... params){
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}


