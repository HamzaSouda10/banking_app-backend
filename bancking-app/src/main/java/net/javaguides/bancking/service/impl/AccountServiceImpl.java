package net.javaguides.bancking.service.impl;

import net.javaguides.bancking.dto.AccountDto;
import net.javaguides.bancking.entity.Account;
import net.javaguides.bancking.mapper.AccountMapper;
import net.javaguides.bancking.repository.AccountRepository;
import net.javaguides.bancking.service.AccountService;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.stream.Collectors;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto
        );
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {

        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));

        double total = account.getBalance() +amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));

        if(account.getBalance() < amount){
            throw new RuntimeException("Insuffient amount");
        }

        double total = account.getBalance() -amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account) ).collect(Collectors.toList());
        return List.of();
    }

    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account does not exists"));
        accountRepository.deleteById(id);


    }
}
