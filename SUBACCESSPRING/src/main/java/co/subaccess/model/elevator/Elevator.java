package co.subaccess.model.elevator;

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
public class Elevator {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private Status status;
	private Accessibility accessibility;
	private Direction direction;
	private String exit; 
	
	
	//CONSTRUCTEUR
	public Elevator(Status status, Accessibility accessibility, Direction direction, String exit) {
		super();
		this.status = status;
		this.accessibility = accessibility;
		this.direction = direction;
		this.exit = exit;
	}
}
