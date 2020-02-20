package com.kidzania.afflesplitify.AccountsRoomDatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName =  "accounts")
public class Accounts {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "account_id")
    private String account_id;
    @ColumnInfo(name = "debit_amount")
    private String debit_amount;
    @ColumnInfo(name = "credit_amount")
    private String credit_amount;
    @ColumnInfo(name = "created_at")
    private String created_at;
    @ColumnInfo(name = "updated_at")
    private String updated_at;

    public Accounts(@NonNull String account_id, String debit_amount, String credit_amount, String created_at, String updated_at) {
        this.account_id = account_id;
        this.debit_amount = debit_amount;
        this.credit_amount = credit_amount;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getDebit_amount() {
        return debit_amount;
    }

    public void setDebit_amount(String debit_amount) {
        this.debit_amount = debit_amount;
    }

    public String getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(String credit_amount) {
        this.credit_amount = credit_amount;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
