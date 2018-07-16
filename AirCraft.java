package com.epam.tsk1.entity;

public abstract class AirCraft {
	private int id;				
	private int speed; 			//maximum Horizontal Speed	
	private float climb;		//Rate Of Climb - vertical speed, m/s 					
	private float ceilings;     //Maximum height aircraft               	
	private String maneuver; 	//Maneuverability Characteristics		
	private String land; 		//Take off and landing Characteristics 		
	private int distance; 		//Technical flight distances, km/h		
	private int flightd;		//Flight duration

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getSpeed() {
		return speed;		
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getClimb(){
		return climb;
	}

	public void setClimb(float climb) {
		this.climb = climb;
	}
	
	public float getCeilings(){
		return ceilings;
	}

	public void setCeilings(float ceilings) {
		this.ceilings = ceilings;
	}

	public String getManeuver() {
		return maneuver;
	}
	
	public void setManeuver(String maneuver) {
		this.maneuver = maneuver;
	}
	
	public String getLand() {
		return land;
	}
	
	public void setLand(String land) {
		this.land = land;
	}
	
	public int getDistance() {
		return distance;
	} 
	
	public void setDistanc(int distance) {
		this.distance = distance;
	}
	
	public int getFlightd() {
		return flightd;
	}
	
}