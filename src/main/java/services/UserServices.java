package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.User;
import repositories.UserRepository;



@Service
@Primary
public class UserServices implements UserServicesInterface {
  
  @Autowired
  UserRepository userRepository;
  
  @Override
  public List<User> getAll(int id) {
   return userRepository.findAllSorted(id);
  }
  
  
  
}
