package com.hw;

public class TestData {

	public Directory fillData() {
		//create FS instance
		Directory rootDirectory = new Directory("root", 2);

		Directory directory1 = new Directory("Dir1", 1);
		Directory directory2 = new Directory("Dir2", 1);
		Directory directory3 = new Directory("Dir3", 0);
		File file1 = new File("File1.txt", 15);
		Link link1 = new Link("Link1", 5);

		rootDirectory.add(directory1);
		rootDirectory.add(directory2);
		rootDirectory.add(directory3);
		rootDirectory.add(file1);
		rootDirectory.add(link1);

		Directory directory11 = new Directory("Dir11", 1);
		Directory directory12 = new Directory("Dir12", 2);
		File file11 = new File("File11.txt", 12);
		File file12 = new File("File12.jpg", 14);
		Link link12 = new Link("Link11", 4);

		directory1.add(directory11);
		directory1.add(directory12);
		directory1.add(file11);
		directory1.add(file12);
		directory1.add(link12);

		File file21 = new File("File21.png", 25);

		directory2.add(file21);

		return rootDirectory;
	}
}
