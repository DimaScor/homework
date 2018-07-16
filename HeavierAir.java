package com.epam.tsk1.entity;

import com.epam.tsk1.enums.AerodynamicPerformance;

public class HeavierAir extends AirCraft{
	private int aerodynamicResistance;
	private int liftingForce;
	private AerodynamicPerformance AerodynamicPerformance;
	
	public int getAerodynamicResistance() {
		return aerodynamicResistance;
	}
		
	public void setAeroDynamicResistance(int aerodynamicResistence) {
		this.aerodynamicResistance = aerodynamicResistence;
	}
	
	public AerodynamicPerformance getAeroDynamicPerformance(){ 
		return AerodynamicPerformance;
	}
	
	public void setAeroDynamicPerformance(AerodynamicPerformance AerodynamicPerformance) {
		this.AerodynamicPerformance = AerodynamicPerformance;
	}
	
	public int getLiftingForce() {
		return liftingForce;
	}
	
	public void setLiftingForce(int liftingForce) {
		this.liftingForce = liftingForce;
	}
	
}
