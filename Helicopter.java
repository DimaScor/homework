package com.epam.tsk1.entity;

import com.epam.tsk1.enums.NumberRotors;
import com.epam.tsk1.enums.TypeRotors;

public class Helicopter extends HeavierAir{
	private int screwRotationPlane;
	private NumberRotors NumberRotors;
	private TypeRotors TypeRotors;
	
	public int getScrewRotationPlane() {
		return screwRotationPlane;
	}
	
	public void setScrewRotationPlane(int screwRotationPlane) {
		this.screwRotationPlane = screwRotationPlane;
	}
	
	public NumberRotors getNumberRotors() {
		return NumberRotors;
	}
	
	public void setNumberRotors(NumberRotors NumberRotors) {
		this.NumberRotors = NumberRotors;
	}
	
	public TypeRotors getTypeRotors(){
		return TypeRotors;
	}
	
	public void setTypeRotors(TypeRotors TypeRotors) {
		this.TypeRotors = TypeRotors;
	}
}
