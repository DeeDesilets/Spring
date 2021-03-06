package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.Director;
import repositories.DirectorRepository;



@Service
@Primary
public class DirectorServices implements DirectorServicesInterface {
  
  @Autowired
  DirectorRepository directorRepository;
  
  @Override
  public List<Director> getAll() {
   return directorRepository.findAllSorted();
  }
  
  
  
}
