package finalVacation.familyMember;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FamilyMember {
	
	@Id
	private String id;
	private String name;
	private String birthdate;
	
	public FamilyMember() {
		
	}
	
	
	public FamilyMember(String id, String name, String birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
