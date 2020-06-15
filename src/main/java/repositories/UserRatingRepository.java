package repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRatingRepository extends JpaRepository  <models.UserRating, Integer> {
  @Query("select ur from models.UserRating ur where userId = id order by ur.userrating")
 List<models.UserRating> findAllSorted(int id);
}
