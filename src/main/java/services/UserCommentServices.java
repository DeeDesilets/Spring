package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import models.UserComment;
import repositories.UserCommentRepository;



@Service
@Primary
public class UserCommentServices implements UserCommentServicesInterface {
  
  @Autowired
  UserCommentRepository userCommentRepository;
  
  @Override
  public List<UserComment> getAll(int id) {
   return userCommentRepository.findAllSorted(id);
  }
  
  
  
}
