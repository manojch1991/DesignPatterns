package com.hw;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.test.StudentJUnitTest;

public class TestClass {

	public static void main(String args[]) {
		Student inStateStudent = StudentFactory.inStateStudent(10000, "ABC", "1 Main St" , 10, StudentStatus.INSTATE);
		Student outstateStudent = StudentFactory.outStateStudent(20000, "XYZ", "1 2nd St", 4, StudentStatus.OUTSTATE);
		Student intlStudent = StudentFactory.intlStudent(30000, "MNO", 1234567890, "Beacon St", 0, "123, Hyderbad", StudentStatus.INTL);
		
		System.out.println("================================");
		System.out.println("Instate Student");
		System.out.println("================================");
		System.out.println("Name:" + inStateStudent.getName() + "\nTuition: " + inStateStudent.getTuition() +
				"\nyears in state: " + inStateStudent.getYrsInState() + "\nUS Address: " + inStateStudent.getUsAddr() +
				"\nI20: "+inStateStudent.getI20num() + "\nForeign Address: " + inStateStudent.getForeignAddr());
		
		System.out.println("================================");
		System.out.println("Outstate Student");
		System.out.println("================================");
		System.out.println("Name:" + outstateStudent.getName() + "\nTuition: " + outstateStudent.getTuition() +
				"\nyears in state: " + outstateStudent.getYrsInState() + "\nUS Address: " + outstateStudent.getUsAddr() +
				"\nI20: "+outstateStudent.getI20num() + "\nForeign Address: " + outstateStudent.getForeignAddr());
		
		System.out.println("================================");
		System.out.println("International Student");
		System.out.println("================================");
		System.out.println("Name:" + intlStudent.getName() + "\nTuition: " + intlStudent.getTuition() +
				"\nyears in state: " + intlStudent.getYrsInState() + "\nUS Address: " + intlStudent.getUsAddr() +
				"\nI20: "+intlStudent.getI20num() + "\nForeign Address: " + intlStudent.getForeignAddr());
		
		System.out.println("Test cases result: ");
		Result result = JUnitCore.runClasses(StudentJUnitTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}
}
