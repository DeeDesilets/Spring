package repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserCommentRepository extends JpaRepository  <models.UserComment, Integer> {
  @Query("select uc from models.UserComment uc where userid = id order by uc.userComment")
 List<models.UserComment> findAllSorted(int id);
}
