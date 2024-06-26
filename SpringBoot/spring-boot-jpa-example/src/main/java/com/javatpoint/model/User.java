package com.javatpoint.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class User 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String username;

private String city;


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(int id, String username, String city) {
	super();
	this.id = id;
	this.username = username;
	this.city = city;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", city=" + city + "]";
}



}
