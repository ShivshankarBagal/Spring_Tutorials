package springMvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String userEmail;
    private String userName;
    private String userPassword;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // Constructors
    public User() {
        super();
    }

    public User(String userEmail, String userName, String userPassword) {
        super();
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword + "]";
    }
}
