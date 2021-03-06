package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (schema="project2", name="genres")
public class Genre {
  @Id
  @Column(name="genreid")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int genreId;
  @ManyToMany
  @JoinTable(name = "genresjoin", joinColumns= @JoinColumn(name = "movieid"),
      inverseJoinColumns = @JoinColumn(name = "genreid"))
  private String genreName;
  
  public Genre() {
    super();
    
  }

  public Genre(int genreId, String genreName) {
    super();
    this.genreId = genreId;
    this.genreName = genreName;
  }

  @Override
  public String toString() {
    return "Genre [genreId=" + genreId + ", genreName=" + genreName + "]";
  }

  public int getGenreId() {
    return genreId;
  }

  

  public String getGenreName() {
    return genreName;
  }

  public void setGenreName(String genreName) {
    this.genreName = genreName;
  }
  
}
