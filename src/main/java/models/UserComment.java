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
@Table(schema="project2", name="usercomment")
public class UserComment{
  @Id
  @Column(name="usercommentid")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int userCommentId;
  @ManyToOne
  @JoinColumn(name="userid")
    private int userId;
  @ManyToOne
    @JoinColumn(name="usercomment")
  private String userComment;
  
  public UserComment() {
    super();
  }
  public UserComment(int userCommentId, int userId, String userComment) {
    super();
    this.userCommentId = userCommentId;
    this.userId = userId;
    this.userComment = userComment;
  }
  @Override
  public String toString() {
    return "UserComment [userCommentId=" + userCommentId + ", userId=" + userId + ", userComment="
        + userComment + "]";
  }
  public int getUserCommentId() {
    return userCommentId;
  }
 
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public String getUserComment() {
    return userComment;
  }
  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }
}  
