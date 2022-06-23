package finalVacation.vacationWish;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VacationWish {

	@Id
	private String vacationWishId;
	private String description;
	private String place;
	private int rating;

	public VacationWish() {
		// TODO Auto-generated constructor stub
	}

	public VacationWish(String vacationWishId, String description, String place, int rating) {
		super();
		this.vacationWishId = vacationWishId;
		this.description = description;
		this.place = place;
		this.rating = rating;
	}
	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating; 
	}

	public String getVacationWishId() {
		return vacationWishId;
	}

	public void setVacationWishId(String vacationWishId) {
		this.vacationWishId = vacationWishId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
