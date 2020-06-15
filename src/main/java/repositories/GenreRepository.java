

package repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface GenreRepository extends JpaRepository  <models.Genre, Integer> {
  @Query("select g from models.Genre g order by g.genreName")
 List<models.Genre> findAllSorted();
}


