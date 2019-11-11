package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class AmineCharacter implements Serializable {
     @Id
     @GeneratedValue

	 private Long idAnime;
	 private String animeName;
	 private String category;
	 private String strength;
	 private byte[] photo;
	 private boolean shared;
	 
	 @ManyToOne
	 @JoinColumn(name = "idUser")
	 private User user;
	 
}
