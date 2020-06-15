package repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DirectorRepository extends JpaRepository  <models.Director, Integer> {
  @Query("select d from models.Director d order by d.directorName")
 List<models.Director> findAllSorted();
}
