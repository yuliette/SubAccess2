package co.subaccess.model.escalator;

//import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import co.subaccess.model.Accessibility;
import co.subaccess.model.Direction;
import co.subaccess.model.Status;
import lombok.Data;

@Data
@Entity
public class Escalator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private Accessibility accessibility; 
	private Direction direction;
	private Status status;
	private String exit;
	
	//CONSTRUCTEUR
	public Escalator(Accessibility accessibility, Direction direction, Status status, String exit) {
		this.accessibility = accessibility;
		this.direction = direction;
		this.status = status;
		this.exit = exit;
	}

}
