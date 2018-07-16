package com.epam.tsk1.entity;

public class LighterAir extends AirCraft{
	private int casingVolume;
	private	int diameterSheath;
	private	int lenghtAirShip;
	private	int constructionHeight;
	private	int weightAirShipDesign;
	private	int weightPayload;
	
	public void setCasingVolume(int casingVolume) {
		 this.casingVolume = casingVolume;
	}
	
	public int getCasingVolume(){
		return casingVolume;
	}

	public int getDiameterSheath() {
		return diameterSheath;
	}
	
	public void setDiameterSheath(int diameterSheath) {
		this.diameterSheath = diameterSheath; 
	}
	
	public int getLenghtAirShip(){
		return lenghtAirShip;
	}
	
	public void setLenghtAirShip(int LenghtAirShip) {
		this.lenghtAirShip = LenghtAirShip;
	}
	
	public int getConstructionHeight() {
		return constructionHeight;
	}

	public void setConstructionHeight(int constructionHeight) {
		this.constructionHeight = constructionHeight;
	}
	
	public int getWeightAirShipDesign() {
		return weightAirShipDesign;
	}
	
	public void setWeightAirShipDesign(int weightAirShipDesign) {
		this.weightAirShipDesign = weightAirShipDesign;
	}
	
	public int getWeightPayload() {
		return weightPayload;
	}
	
	public void setWeightPayload(int weightPayload) {
		this.weightPayload = weightPayload;
	}
	
}





