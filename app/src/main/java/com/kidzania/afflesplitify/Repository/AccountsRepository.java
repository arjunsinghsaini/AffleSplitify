//package com.kidzania.afflesplitify.Repository;
//
//import android.app.Application;
//import android.os.AsyncTask;
//
//import androidx.lifecycle.MutableLiveData;
//
//import com.kidzania.afflesplitify.AccountsRoomDatabase.AccountsRoomDatabase;
//import com.kidzania.afflesplitify.AccountsRoomDatabase.DAO.AccountsDao;
//import com.kidzania.afflesplitify.AccountsRoomDatabase.entity.Accounts;
//import java.util.List;
//
//public class AccountsRepository {
//
//    private AccountsDao mAccountsDao;
//    private MutableLiveData<List<Accounts>> mallAccounts;
//
//    AccountsRepository(Application application){
//        AccountsRoomDatabase db = AccountsRoomDatabase.getDatabase(application);
//        mAccountsDao = db.accountsDao();
//        mallAccounts = mAccountsDao.getAllAccounts();
//    }
//
//    MutableLiveData<List<Accounts>> getMallAccounts(){
//        return mallAccounts;
//    }
//
//
//    public void insert(Accounts accounts){
//        new insertAsyncTask(mAccountsDao).execute(accounts);
//    }
//
//
//    private static class insertAsyncTask extends AsyncTask<Accounts, Void, Void>{
//
//
//        private AccountsDao mAsyncTaskDao;
//
//        insertAsyncTask(AccountsDao dao){
//            mAsyncTaskDao = dao;
//        }
//
//        @Override
//        protected Void doInBackground(final Accounts... params){
//            mAsyncTaskDao.insert(params[0]);
//            return  null;
//        }
//    }
//
//}
