package net.javaguides.bancking.service;

import net.javaguides.bancking.dto.AccountDto;
import net.javaguides.bancking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id,double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
