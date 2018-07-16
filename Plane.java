package com.epam.tsk1.entity;

import com.epam.tsk1.enums.BodyTypePl;
import com.epam.tsk1.enums.MannedType;

public class Plane extends HeavierAir {
	private String internalAerodynamics;
	private MannedType MannedType;
	private BodyTypePl BodyTypePl;
	
	public String getInternalAerodynamics() {
		return internalAerodynamics;
	}
	
	public void setInternalAerodynamics(String internalAerodynamics) {
		this.internalAerodynamics = internalAerodynamics;
	}
	
	public MannedType getMannedType() {
		return MannedType;
	}
	
	public void setMannedType(MannedType MannedType) {
		this.MannedType = MannedType;
	}
	
	public BodyTypePl getBodyTypePl() {
		return BodyTypePl;
	}
	
	public void setBodyTypePl(BodyTypePl BodyTypePl) {
		this.BodyTypePl = BodyTypePl;
	}
	
}
