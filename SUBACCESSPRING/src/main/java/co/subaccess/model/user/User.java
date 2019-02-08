package co.subaccess.model.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@NotEmpty
	@Min(3)
	@Max(50)
	private String name;
	@NotEmpty
	@Min(6)
	@Max(60)
	private String mail;
	@NotEmpty
	@Min(10)
	@Max(14)
	private String phone;
	@NotEmpty
	@Min(3)
	@Max(40)
	private String pseudo;
	@NotEmpty
	private String password;
	@NotNull
	private boolean active;
	@NotNull
	private boolean gender;
	
	protected User() {
		//Constructeurs vide pour hibernet
	}
	
	//CONSTRUCTEUR

	public User(long id, @NotEmpty String name, @NotEmpty String mail, @NotEmpty String phone,
			@NotEmpty String pseudo, @NotEmpty String password, @NotNull boolean active, @NotNull boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.phone = phone;
		this.pseudo = pseudo;
		this.password = password;
		this.active = active;
		this.gender = gender;
	}
}
