package entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    @Id 
    @GeneratedValue
    
	private Long idUser;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	@Lob
	private byte[] photo;
	
	@OneToMany(mappedBy = "user")
	private List<AmineCharacter> characters;
	
}
