package com.epam.tsk1.entity;

import com.epam.tsk1.enums.AirShipType;

public class AirShip extends LighterAir {
	private int passangerGondollaSize;
	private int cargoGandollaSize;
	private AirShipType AirShipType;
	
	public int getPassangerGondollaSize() {
		return passangerGondollaSize; 
	}
	
	public void setPassangerGondollaSize(int passangerGondollaSize) {
		this.passangerGondollaSize = passangerGondollaSize;
	}
	
	public int getCargGandollaSize() {
		return cargoGandollaSize;
	}
	
	public void setCargoGandollasize(int cargoGandollaSize) {
		this.cargoGandollaSize = cargoGandollaSize;
	}
	
	public AirShipType getAirShipType() {
		return AirShipType;
	}
	
	public void setAirShipType(AirShipType AirShipType) {
		this.AirShipType = AirShipType;
	}
	
}
