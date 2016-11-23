package koprulu.repository;

/**
 * Created by Ali on 23.11.2016.
 */
import koprulu.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
