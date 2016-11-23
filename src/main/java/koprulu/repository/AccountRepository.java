package koprulu.repository;

/**
 * Created by Ali on 23.11.2016.
 */
import koprulu.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
