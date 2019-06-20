package example.db.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "record2")
public class Record {
	
	@Column(name = "Countrycode")
	private String Countrycode;

	@Id
	@Column(name = "zipcodefrom")
	private String zipcodefrom;
	
	 @Column(name="Destination") 
	 private String Destination;
	 
	 @Column(name = "State")
	private String State;

	public String getCountrycode() {
		return Countrycode;
	}

	public void setCountrycode(String countrycode) {
		Countrycode = countrycode;
	}

	public String getZipcodefrom() {
		return zipcodefrom;
	}

	public void setZipcodefrom(String zipcodefrom) {
		this.zipcodefrom = zipcodefrom;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

}
