package com.ilovecandy.reminderapllication.datastore.repository

import com.ilovecandy.reminderapllication.datastore.entity.Account
import com.ilovecandy.reminderapllication.datastore.room.AccountDao

class AccountRepository(
    private val accountDao: AccountDao
){
    fun getPassword(username: String): String = accountDao.getPassword(username)

    suspend fun addAccount(account: Account) = accountDao.insert(account)
}