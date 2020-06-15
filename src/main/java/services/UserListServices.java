package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.UserList;
import repositories.UserListRepository;



@Service
@Primary
public class UserListServices implements UserListServicesInterface {
  
  @Autowired
  UserListRepository userListRepository;
  
  @Override
  public List<UserList> getAll(int id) {
   return userListRepository.findAllSorted(id);
  }
  
  
  
}
