package com.hw;

public class Student {
	float tuition;
	String name;
	int i20num;
	String usAddr;
	int yrsInState;
	String foreignAddr;
	StudentStatus status;
	
	Student (float tuition, String name, int i20num, String usAddr, int yrsInState, String foreignAddr, StudentStatus status) {
		this.tuition = tuition;
		this.name = name;
		this.i20num = i20num;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.foreignAddr = foreignAddr;
		this.status = status;
	}
	public float getTuition() {
		return tuition;
	}
	
	public String getName() {
		return name;
	}
	
	public int getI20num() {
		return i20num;
	}
	
	public String getUsAddr() {
		return usAddr;
	}
	
	public int getYrsInState() {
		return yrsInState;
	}
	
	public String getForeignAddr() {
		return foreignAddr;
	}
}