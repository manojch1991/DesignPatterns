package com.test;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

import com.hw.Student;
import com.hw.StudentFactory;
import com.hw.StudentStatus;


public class StudentJUnitTest {

	@Test
	public void studentInState(){
		Student inStateStudent = StudentFactory.inStateStudent(10000, "ABC", "1 Main St" , 10, StudentStatus.INSTATE);
		
		float expectedFee = 10000;
		float actualFee = inStateStudent.getTuition();
		String expectedName = "ABC";
		String actualName = inStateStudent.getName();
		String expectedUSAddress = "1 Main St";
		String actualUSAddress = inStateStudent.getUsAddr();
		String exceptedIntlAddr = null;
		String actualIntlAddr = inStateStudent.getForeignAddr();
		int expectedYears = 10;
		int actualyears = inStateStudent.getYrsInState();
		StudentStatus expectedStatus = StudentStatus.INSTATE;
		StudentStatus actualStatus = StudentStatus.INSTATE;
		
		Assert.assertThat(expectedFee, CoreMatchers.is(actualFee)); 
		Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(expectedUSAddress, actualUSAddress);
		Assert.assertThat(expectedYears, CoreMatchers.is(actualyears)); 
		Assert.assertThat(expectedStatus, CoreMatchers.is(actualStatus)); 
		Assert.assertEquals(exceptedIntlAddr, actualIntlAddr);
	}
	
	@Test
	public void studentOutState(){
		Student outstateStudent = StudentFactory.outStateStudent(20000, "XYZ", "1 2nd St", 4, StudentStatus.OUTSTATE);
		
		float expectedFee = 20000;
		float actualFee = outstateStudent.getTuition();
		String expectedName = "XYZ";
		String actualName = outstateStudent.getName();
		String expectedUSAddress = "1 2nd St";
		String actualUSAddress = outstateStudent.getUsAddr();
		int expectedYears = 4;
		int actualyears = outstateStudent.getYrsInState();
		StudentStatus expectedStatus = StudentStatus.OUTSTATE;
		StudentStatus actualStatus = StudentStatus.OUTSTATE;
		String exceptedIntlAddr = null;
		String actualIntlAddr = outstateStudent.getForeignAddr();
		
		Assert.assertThat(expectedFee, CoreMatchers.is(actualFee)); 
		Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(expectedUSAddress, actualUSAddress);
		Assert.assertThat(expectedYears, CoreMatchers.is(actualyears)); 
		Assert.assertThat(expectedStatus, CoreMatchers.is(actualStatus)); 
		Assert.assertEquals(exceptedIntlAddr, actualIntlAddr);
	}
	
	@Test
	public void studentIntl(){
		Student intlStudent = StudentFactory.intlStudent(30000, "MNO", 1234567890, "Beacon St", 0, "123, Hyderbad", StudentStatus.INTL);
		
		float expectedFee = 30000;
		float actualFee = intlStudent.getTuition();
		String expectedName = "MNO";
		String actualName = intlStudent.getName();
		String expectedUSAddress = "Beacon St";
		String actualUSAddress = intlStudent.getUsAddr();
		int expectedYears = 0;
		int actualyears = intlStudent.getYrsInState();
		StudentStatus expectedStatus = StudentStatus.INTL;
		StudentStatus actualStatus = StudentStatus.INTL;
		String exceptedIntlAddr = "123, Hyderbad";
		String actualIntlAddr = intlStudent.getForeignAddr();
		
		Assert.assertThat(expectedFee, CoreMatchers.is(actualFee)); 
		Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(expectedUSAddress, actualUSAddress);
		Assert.assertThat(expectedYears, CoreMatchers.is(actualyears)); 
		Assert.assertThat(expectedStatus, CoreMatchers.is(actualStatus)); 
		Assert.assertEquals(exceptedIntlAddr, actualIntlAddr);
	}
	
	@Test
	public void studentFactoryTestInState(){
		Student s = StudentFactory.inStateStudent(10000, "ABC", "1 Main St" , 10, StudentStatus.INSTATE);
		Assert.assertSame(true, s instanceof Student);
	}
	
	@Test
	public void studentFactoryTestOutState(){
		Student s = StudentFactory.outStateStudent(20000, "XYZ", "1 2nd St", 4, StudentStatus.OUTSTATE);
		Assert.assertSame(true, s instanceof Student);
	}
	
	@Test
	public void studentFactoryTestIntl(){
		Student s = StudentFactory.intlStudent(30000, "MNO", 1234567890, "Beacon St", 0, "123, Hyderbad", StudentStatus.INTL);
		Assert.assertSame(true, s instanceof Student);
	}
}
