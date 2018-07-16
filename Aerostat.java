package com.epam.tsk1.entity;

import  com.epam.tsk1.enums.MannedType;
import  com.epam.tsk1.enums.AerostatType;

public class Aerostat extends LighterAir {
	private MannedType MannedType;
	private AerostatType AerostatType;
	
	public void setAeroStatType(AerostatType AerostatType) {
		this.AerostatType = AerostatType;
	}
	
	public AerostatType getAeroStatType() {
		return AerostatType;
	}
	
	public void setMannedType(MannedType MannedType) {
		this.MannedType = MannedType;
	}
	
	public MannedType getMannedType() {
		return MannedType;
	}

}
