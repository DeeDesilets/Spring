package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.UserRating; 
import services.UserRatingServices; 
 
 
@RestController 
public class UserRatingController { 
   
  @Autowired 
  UserRatingServices userRatingServices; 
   
  @GetMapping("/userratings/:id") 
  public List<UserRating> GetAllUserRatings(int id )  { 
    //const id = +req.params.id; 
     return userRatingServices.getAll(id); 
} 
   
   
} 