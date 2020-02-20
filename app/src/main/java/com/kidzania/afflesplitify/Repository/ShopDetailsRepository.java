//package com.kidzania.afflesplitify.Repository;
//
//import android.app.Application;
//import android.os.AsyncTask;
//
//import androidx.lifecycle.MutableLiveData;
//
//import com.kidzania.afflesplitify.AccountsRoomDatabase.AccountsRoomDatabase;
//import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.ShopDetailsDao;
//import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Shop_Details;
//
//import java.util.List;
//
//public class ShopDetailsRepository {
//
//
//    private ShopDetailsDao mShopDetailsDao;
//    MutableLiveData<List<Shop_Details>> mAllShopDetails;
//
//    ShopDetailsRepository(Application application){
//        AccountsRoomDatabase db =  AccountsRoomDatabase.getDatabase(application);
//        mShopDetailsDao = db.shopDetailsDao();
//        mAllShopDetails = mShopDetailsDao.getAllShopDetails();
//    }
//
//    MutableLiveData<List<Shop_Details>> getAllShopDetails(){
//            return mAllShopDetails;
//    }
//
//
//    public void insert (Shop_Details shop_details) {
//        new insertAsyncTask(mShopDetailsDao).execute(shop_details);
//    }
//
//    private static class insertAsyncTask extends AsyncTask<Shop_Details, Void, Void> {
//
//        private ShopDetailsDao mAsyncTaskDao;
//
//        insertAsyncTask(ShopDetailsDao dao) {
//            mAsyncTaskDao = dao;
//        }
//
//        @Override
//        protected Void doInBackground(final Shop_Details... params) {
//            mAsyncTaskDao.insert(params[0]);
//            return null;
//        }
//    }
//
//
//}
