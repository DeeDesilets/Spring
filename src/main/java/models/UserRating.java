  package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="project2", name="userrating")
public class UserRating{
  @Id
  @Column(name="userratingid")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int userRatingId;
  @ManyToOne
  @JoinColumn(name="userid")
    private int userId;
  @ManyToOne
    @JoinColumn(name="usercomment")
  private String userRating;
  
  public UserRating() {
    super();
    
  }

  public UserRating(int userRatingId, int userId, String userRating) {
    super();
    this.userRatingId = userRatingId;
    this.userId = userId;
    this.userRating = userRating;
  }

  @Override
  public String toString() {
    return "UserRating [userRatingId=" + userRatingId + ", userId=" + userId + ", userRating="
        + userRating + "]";
  }

  public int getUserRatingId() {
    return userRatingId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUserRating() {
    return userRating;
  }

  public void setUserRating(String userRating) {
    this.userRating = userRating;
  }
  
}
