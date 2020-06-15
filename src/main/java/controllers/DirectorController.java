package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.Director; 
import services.DirectorServices; 
 
 
@RestController 
public class DirectorController { 
   
  @Autowired 
  DirectorServices directorServices; 
   
  @GetMapping("/directors") 
  public List<Director> GetAllActors()  { 
     return directorServices.getAll(); 
} 
} 