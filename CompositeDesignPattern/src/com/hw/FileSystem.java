package com.hw;

public class FileSystem {
	private static FileSystem instance = new FileSystem(); // = null;

	private FileSystem() {
	}

	public static FileSystem getInstance() {
		if(instance == null) {
			//create new
		}
		// else return same
		return instance;
	}
	
	public void itrDir(FSElement element) {
		if (element instanceof Directory) {
			System.out.println(element); // for print element
			System.out.println("Total size is : " + element.getSize()); // for print total size of dir
			Directory directory = (Directory) element;
			for (FSElement dir : directory.getChildren()) {
				itrDir(dir);
			}
		} else {
			System.out.println(element);// for print element
			System.out.println("Total size is : " + element.getSize());// for print total size of file
		}
	}
}
