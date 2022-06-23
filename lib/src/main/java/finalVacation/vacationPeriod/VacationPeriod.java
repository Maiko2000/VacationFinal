package finalVacation.vacationPeriod;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VacationPeriod {
	
	@Id
	private String vacationId;
	private String title;
	private String timePeriod;
	
	public VacationPeriod() {
		// TODO Auto-generated constructor stub
	}

	public VacationPeriod(String vacationId, String title, String timePeriod) {
		super();
		this.vacationId = vacationId;
		this.title = title;
		this.timePeriod = timePeriod;
	}

	public String getVacationId() {
		return vacationId;
	}

	public void setVacationId(String vacationId) {
		this.vacationId = vacationId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}


}
