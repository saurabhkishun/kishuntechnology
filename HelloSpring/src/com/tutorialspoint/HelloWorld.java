package com.tutorialspoint;

public class HelloWorld {

	
	private String lastName;
	
	private String message;

	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void getLastName() {
		//return lastName;
		System.out.println("Last Name : " + lastName);
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	}
