package co.subaccess.model.subway;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import co.subaccess.model.elevator.Elevator;
import co.subaccess.model.escalator.Escalator;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Subway {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long id;
	private String name; 
	private double attitude;
	private double longitude;
	private int line;
	private String city;
	private String direction;
	//COLLECTION
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@Getter(AccessLevel.PROTECTED)
	@Setter(AccessLevel.PROTECTED)
	private Set<Escalator> escalators = new HashSet<Escalator>();
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@Getter(AccessLevel.PROTECTED)
	@Setter(AccessLevel.PROTECTED)
	private Set<Elevator> elevators = new HashSet<Elevator>();
	
	protected Subway() { //Constructeur vide pour hibernet
	} 
		

	//CONSTRUCTEUR 
	
	public Subway(String name, double attitude, double longitude, int line, String city, String direction) {
		this.name = name;
		this.attitude = attitude;
		this.longitude = longitude;
		this.line = line;
		this.city = city;
		this.direction = direction;
	}
	
	//METHODE 
	
	
	public void addEscalator(Escalator escalator) {
		if (escalators != null) {
			escalators.add(escalator);
		}
	}
	
	public void addElevator(Elevator elevator) {
		if (elevators != null) {
		elevators.add(elevator);
		}
	}

	//METHODE
	
	public List<Escalator> getEscalator() {
		return new ArrayList<Escalator>(escalators) ;
	}

	public List<Elevator> getElevator() {
		return new ArrayList<Elevator>(elevators);
	}
	
	//METHODE
		
		
	public void removeEscalator(Escalator escalator) {
		if (escalators != null) {
		escalators.remove(escalator);
		}
	}		

	public void removeElevator(Elevator elevator) {
		if (elevators != null) {
			elevators.remove(elevator);
		}
	}
}
