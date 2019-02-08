package co.subaccess.model.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotEmpty
	private Long id;
	@NotEmpty
	private String mail;
	@NotEmpty
	private String password;

	public Admin(@NotEmpty String mail, @NotEmpty String password) {
		super();
		this.mail = mail;
		this.password = password;
	}
}
