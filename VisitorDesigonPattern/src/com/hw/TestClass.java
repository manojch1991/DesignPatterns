package com.hw;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		
		TestData testData = new TestData();
		Directory rootDirectory = testData.fillData();
		
		CountingVisitor countingVisitor = new CountingVisitor();
		rootDirectory.accept(countingVisitor);
		int totalDir = countingVisitor.getDirNum();
		System.out.println("==================================");
		System.out.println("Directory Total ");
		System.out.println("==================================");
		System.out.println("Total Number Of Directories : " + totalDir);
		
		
		System.out.println("==================================");
		System.out.println("File Total ");
		System.out.println("==================================");
		int totalFile = countingVisitor.getFileNum();
		System.out.println("Total Number Of Files : " + totalFile);
		
		
		System.out.println("==================================");
		System.out.println("Link Total ");
		System.out.println("==================================");
		int totalLink = countingVisitor.getLinkNum();
		System.out.println("Total Number Of Links : " + totalLink);
		
		FileSearchVisitor fileSearchVisitor = new FileSearchVisitor();
		fileSearchVisitor.setExtension("txt");
		rootDirectory.accept(fileSearchVisitor);
		ArrayList<File> foundList = fileSearchVisitor.getFoundFiles();

		System.out.println("==================================");
		System.out.println("Total Occurence");
		System.out.println("==================================");
		System.out.println("Total Number Of Found Files : " + foundList.size());

		System.out.println("==================================");
		System.out.println("Found Files List");
		System.out.println("==================================");
		for (File file : foundList) {
			System.out.println(file.getName());
		}
		
		SizeCountingVisitor sizeCountingVisitor = new SizeCountingVisitor();
		rootDirectory.accept(sizeCountingVisitor);
		int totalSize = sizeCountingVisitor.getTotalSize();
		System.out.println("\nTotal size is : " + totalSize);
	}

}
