package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.UserRating;
import repositories.UserRatingRepository;



@Service
@Primary
public class UserRatingServices implements UserRatingServicesInterface {
  
  @Autowired
  UserRatingRepository userRatingRepository;
  
  @Override
  public List<UserRating> getAll(int id) {
   return userRatingRepository.findAllSorted(id);
  }
  
  
  
}
