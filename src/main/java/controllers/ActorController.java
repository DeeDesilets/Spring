package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.Actor; 
import services.ActorServices; 
 
 
@RestController 
public class ActorController { 
   
  @Autowired 
  ActorServices actorServices; 
   
  @GetMapping("/actors") 
  public List<Actor> getAllActors()  { 
     return actorServices.getAll(); 
} 
} 
 