package com.ilovecandy.reminderapllication.ui.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ilovecandy.reminderapllication.Graph
import com.ilovecandy.reminderapllication.datastore.entity.Account
import com.ilovecandy.reminderapllication.datastore.repository.AccountRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SignUpViewModel (
    private val accountRepository: AccountRepository = Graph.accountRepository,
        ): ViewModel(){

    suspend fun saveAccount(account: Account){
        return accountRepository.addAccount(account)
    }

    fun  getPassword(username: String) : String{
        return accountRepository.getPassword(username)
    }
}

data class AccountViewState(
    val accounts: List<Account> = emptyList()
)