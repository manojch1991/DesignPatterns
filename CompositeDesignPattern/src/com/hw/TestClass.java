package com.hw;

import java.util.Date;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.test.FSElementTest;


public class TestClass {

	public static void main(String args[]) {
		
		Directory rootDirectory = new Directory("root", "admin", new Date(), new Date(), 0);
		
		Directory directory1 = new Directory("Dir1", "admin", new Date(), new Date(), 0);
		Directory directory2 = new Directory("Dir2", "admin", new Date(), new Date(), 0);
		Directory directory3 = new Directory("Dir3", "admin", new Date(), new Date(), 0);
		File file1 = new File("File1", "admin", new Date(), new Date(), 15);
		
		rootDirectory.add(directory1);
		rootDirectory.add(directory2);
		rootDirectory.add(directory3);
		rootDirectory.add(file1);
		
		Directory directory11 = new Directory("Dir11", "admin", new Date(), new Date(), 0);
		Directory directory12 = new Directory("Dir12", "admin", new Date(), new Date(), 0);
		File file11 = new File("File11", "admin", new Date(), new Date(), 12);
		File file12 = new File("File12", "admin", new Date(), new Date(), 14);
		
		directory1.add(directory11);
		directory1.add(directory12);
		directory1.add(file11);
		directory1.add(file12);
		
		File file21 = new File("File21", "admin", new Date(), new Date(), 25);
		
		directory2.add(file21);
		

		//For get total size of dir
		System.out.println("==================================");
		System.out.println("For get total size of dir");
		System.out.println("==================================");
		int totalSize = rootDirectory.getSize();
		System.out.println("Total size is : " + totalSize);
		
		//For there is leaf available or not
		System.out.println("==================================");
		System.out.println("For there is leaf available or not");
		System.out.println("==================================");
		boolean isLeaf= rootDirectory.isLeaf();
		System.out.println("Leaf available for "+ rootDirectory.getName() +" : " + isLeaf);
		isLeaf= directory3.isLeaf();
		
		System.out.println("Leaf available for "+ directory3.getName() +" : " + isLeaf);
		isLeaf= file11.isLeaf();
		System.out.println("Leaf available for "+ file11.getName() +" : " + isLeaf);
		
		//For travel over tree structure 
		System.out.println("==================================");
		System.out.println("For travel over tree structure");
		System.out.println("==================================");
		FileSystem.getInstance().itrDir(rootDirectory);
		
		System.out.println("Test cases result: ");
		Result result = JUnitCore.runClasses(FSElementTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}
}
