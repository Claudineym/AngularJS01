/**
 * 
 */
package br.com.angular.app.model;

import java.io.Serializable;

/**
 * @author claudiney.viana
 *
 */
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String userName;
	private String city;
	private String email;
	
	public User(){}
	
	public User(long id, String userName, String city, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.city = city;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
