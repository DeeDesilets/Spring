package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.Actor;
import repositories.ActorRepository;




@Service
@Primary
public class ActorServices implements ActorServicesInterface {
  
  @Autowired
  ActorRepository actorRepository;
  
  @Override
  public List<Actor> getAll() {
   return actorRepository.findAllSorted();
  }
  
}