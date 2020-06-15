package controllers; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
import models.UserList; 
import services.UserListServices; 
 
 
@RestController 
public class UserListController { 
   
  @Autowired 
  UserListServices userListServices; 
   
  @GetMapping("/userlists/:id") 
  public List<UserList> GetAllUserLists(int id )  { 
 //   const id = +req.params.id; 
     return userListServices.getAll(id); 
} 
   
   
} 