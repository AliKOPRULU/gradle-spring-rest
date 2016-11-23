package koprulu.model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
/**
 * Created by Ali on 23.11.2016.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
