package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.UserComment; 
import services.UserCommentServices; 
 
 
@RestController 
public class UserCommentController { 
   
  @Autowired 
  UserCommentServices userCommentServices; 
   
  @GetMapping("/usercomments/:id") 
  public List<UserComment> GetAllUserComments(int id )  { 
   // const id = +req.params.id; 
     return userCommentServices.getAll(id); 
} 
   
   
} 