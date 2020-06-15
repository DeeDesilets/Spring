package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.Genre;
import repositories.GenreRepository;



@Service
@Primary
public class GenreServices implements GenreServicesInterface {
  
  @Autowired
  GenreRepository genreRepository;
  
  @Override
  public List<Genre> getAll() {
   return genreRepository.findAllSorted();
  }
  
  
  
}
