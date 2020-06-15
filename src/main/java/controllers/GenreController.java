package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.Genre; 
import services.GenreServices; 
 
 
@RestController 
public class GenreController { 
   
  @Autowired 
  GenreServices genreServices; 
   
  @GetMapping("/genres") 
  public List<Genre> GetAllGenres()  { 
     return genreServices.getAll(); 
} 
} 