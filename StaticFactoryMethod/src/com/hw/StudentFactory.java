package com.hw;

public abstract class StudentFactory {
	
	public static Student inStateStudent(float tuition, String name, String usAddr, int yrsInState, StudentStatus status){
		return new Student(tuition, name, 0, usAddr, yrsInState, null, StudentStatus.INSTATE);
	}
	
	public static Student outStateStudent(float tuition, String name, String usAddr, int yrsInState,StudentStatus status){
		return new Student(tuition, name, 0, usAddr, yrsInState, null, StudentStatus.OUTSTATE);
	}
	
	public static Student intlStudent(float tuition, String name, int i20num, String usAddr, int yrsInState, String foreignAddr, StudentStatus status){
		return new Student(tuition, name, i20num, usAddr, yrsInState, foreignAddr, StudentStatus.INTL);
	}
	
}