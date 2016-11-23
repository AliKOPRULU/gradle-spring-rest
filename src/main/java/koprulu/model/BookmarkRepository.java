package koprulu.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
/**
 * Created by Ali on 23.11.2016.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
