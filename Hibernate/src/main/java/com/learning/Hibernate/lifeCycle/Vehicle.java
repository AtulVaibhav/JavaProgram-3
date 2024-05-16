package com.learning.Hibernate.lifeCycle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int vehicleId;
  private String vehicleName;
  private String registrationNumber;
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
public Vehicle(String vehicleName, String registrationNumber) {
	super();
	this.vehicleName = vehicleName;
	this.registrationNumber = registrationNumber;
}
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public String getRegistrationNumber() {
	return registrationNumber;
}
public void setRegistrationNumber(String registrationNumber) {
	this.registrationNumber = registrationNumber;
}
@Override
public String toString() {
	return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", registrationNumber="
			+ registrationNumber + "]";
}
  
  
  
}
