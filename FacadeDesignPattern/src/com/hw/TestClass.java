package com.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

public class TestClass {

	
	private static FileSystem fileSystem = null;
	private static Directory rootDirectory = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileSystem = FileSystem.getInstance();
		rootDirectory = new Directory("root", "admin", new Date(), new Date(), 0);
		
		Directory directory1 = new Directory("Dir1", "admin", new Date(), new Date(), 0);
		Directory directory2 = new Directory("Dir2", "admin", new Date(), new Date(), 0);
		Directory directory3 = new Directory("Dir3", "admin", new Date(), new Date(), 0);
		File file1 = new File("File1", "admin", new Date(), new Date(), 9);
		Link link1 = new Link("Link1", "admin", new Date(), new Date(), 10);
		
		fileSystem.addDirectory(directory1, rootDirectory);
		fileSystem.addDirectory(directory2, rootDirectory);
		fileSystem.addDirectory(directory3, rootDirectory);
		fileSystem.addFile(file1, rootDirectory);
		fileSystem.addLink(link1, rootDirectory);
		
		Directory directory11 = new Directory("Dir11", "admin", new Date(), new Date(), 0);
		Directory directory12 = new Directory("Dir12", "admin", new Date(), new Date(), 0);
		File file11 = new File("File11", "admin", new Date(), new Date(), 12);
		File file12 = new File("File12", "admin", new Date(), new Date(), 14);
		
		fileSystem.addDirectory(directory11,directory1);
		fileSystem.addDirectory(directory12,directory1);
		fileSystem.addFile(file11,directory1);
		fileSystem.addFile(file12,directory1);
		
		File file21 = new File("File21", "admin", new Date(), new Date(), 25);
		Link link21 = new Link("Link21", "admin", new Date(), new Date(), 10);
		Link link22 = new Link("Link22", "admin", new Date(), new Date(), 20);
		fileSystem.addFile(file21, directory2);
		fileSystem.addLink(link21, directory2);
		fileSystem.addLink(link22, directory2);
		
		fileSystem.setDirectory(rootDirectory);
		
		
		while(true) {
			String currentPath = fileSystem.getDirectory().getName();
			System.out.println("type 'Exit' to exit");
			System.out.println(currentPath + ">");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String readLine = null;
			try {
				readLine = input.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] commandSplit = readLine.split(" ");
			execCommand(commandSplit);
		}
	}

	private static void execCommand(String[] input) {
		switch (input[0].toLowerCase()) {
		
		case "ls":
			fileSystem.lsExecute();
			break;
		case "pwd":
			fileSystem.pwdExecute();
			break;
		case "redo":
			fileSystem.getCommandHistory().pop();
			break;
		case "cd":
			if(input[1].length() > 0){
				List<FSElement> children = fileSystem.getDirectory().getChildren();
				for(FSElement child: children){
					 if(!child.isLeaf()){
						if(child.getName().equals(input[1])) {
							fileSystem.setDirectory((Directory) child);
							System.out.println(fileSystem.getDirectory().getName());
						}
					 }
				}
			}
			break;
		case "dir":
			fileSystem.dirExecute();
			break;
		case "mkdir":
			String dir = input[1];
			Directory newDir = new Directory(dir, "admin1", new Date(), new Date(), 0);
			fileSystem.mkdirExecute(newDir);
			break;
		case "rmdir":
			String rmdir = input[1];
			if(input[1].length() > 0){
				List<FSElement> children = fileSystem.getDirectory().getChildren();
//				if(children.isEmpty()){
					fileSystem.rmDirectory();
//				}
				/*else{
					fileSystem.rmdirExecute(rmdir);
					for(FSElement child: children){
						if(child.getName().equalsIgnoreCase(rmdir)){
							fileSystem.rmdirExecute((Directory) child);
						}
					}
				}*/
			}
			break;
		case "history":
			fileSystem.historyExecute();
			break;
		case "sort":
			fileSystem.sortExecute();
			break;
		case "chown" :
			try{
				String newOwner = input[1];
				fileSystem.chownExecute(fileSystem.getDirectory(), newOwner);
			}
			catch(Exception e) {
				
			}
			break;
		case "exit" :
			System.exit(0);
			break;
		default:
			System.out.println("Please enter valid command");
			break;
		}
		
	}

}
