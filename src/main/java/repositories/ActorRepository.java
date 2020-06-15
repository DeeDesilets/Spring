package repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import models.Actor;

@Repository  
public interface ActorRepository extends JpaRepository  <Actor, Integer> {
  @Query("select a from Actor a order by a.actorName")
 List<Actor> findAllSorted();
}
