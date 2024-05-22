package springMvc.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;  
    private String lastName;  
    private String Gender;  
    private String[] Food;  
    public Reservation()  
    {         
    }  
    public String getFirstName() {  
        return firstName;  
    }  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
    public String getLastName() {  
        return lastName;  
    }  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
    public String getGender() {  
        return Gender;  
    }  
    public void setGender(String gender) {  
        Gender = gender;  
    }  
    public Reservation(int id, String firstName, String lastName, String gender, String[] food) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Food = food;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Gender=" + Gender
				+ ", Food=" + Arrays.toString(Food) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getFood() {  
        return Food;  
    }  
    public void setFood(String[] food) {  
        Food = food;  
    }   
    
}  