package repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository  <models.UserComment, Integer> {
  @Query("select u from models.User u where userid = id order by u.username")
 List<models.User> findAllSorted(int id);
}
