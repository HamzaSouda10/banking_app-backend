package net.javaguides.bancking.repository;

import net.javaguides.bancking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
