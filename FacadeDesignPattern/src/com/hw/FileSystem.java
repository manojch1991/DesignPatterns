package com.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw.shell.Cd;
import com.hw.shell.Chown;
import com.hw.shell.Command;
import com.hw.shell.CommandHistory;
import com.hw.shell.Dir;
import com.hw.shell.History;
import com.hw.shell.Ls;
import com.hw.shell.Mkdir;
import com.hw.shell.Pwd;
import com.hw.shell.Redo;
import com.hw.shell.Rmdir;
import com.hw.shell.Sort;

public class FileSystem {

	private static FileSystem instance = new FileSystem();

	private Directory directory;
	private Directory cdDirectory;
	private Directory currentDirectory;
	private File file;
	private Link link;
	private Ls ls;
	private Redo redo;
	private Cd cd;
	private Pwd pwd;
	private Dir dir;
	private Sort sort;
	private History history;
	private Chown chown;
	private Mkdir mkdir;
	private Rmdir rmdir;
	
	private FSElement changeOwner = null;
	private String fileOwner = "";
	private Directory makeDir;
	CommandHistory commandHistory;

	private FileSystem() {
		ls = new Ls();
		redo = new Redo();
		cd = new Cd();
		pwd = new Pwd();
		dir = new Dir();
		sort = new Sort();
		history = new History();
		chown = new Chown();
		mkdir = new Mkdir();
		rmdir = new Rmdir();
		commandHistory = new CommandHistory();
	}

	public static FileSystem getInstance() {
		return instance;
	}
		
	public void setDirectory(Directory directory) {
		this.directory = directory;
		currentDirectory = directory;
	}

	public Directory getDirectory() {
		return currentDirectory;
	}
	
	public void setFile(File file) {
		this.file = file;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public CommandHistory getCommandHistory() {
		return commandHistory;
	}

	public void addDirectory(Directory d, Directory parentDir) {
		parentDir.appendChild(d);
	}
	public void addFile(File f, Directory parentDir) {
		parentDir.appendChild(f);
	}
	public void addLink(Link l, Directory parentDir) {
		parentDir.appendChild(l);
	}
		
	public void showAllElements(){
		showAllElements(currentDirectory);
	}
	public void showAllElements(FSElement element){
		if (element instanceof Directory) {
			System.out.println(element); // for print element
			Directory directory = (Directory) element;
			for (FSElement dir : directory.getChildren()) {
				showAllElements(dir);
				
			}
		} else {
			System.out.println(element);// for print element
		}
	}
	
	public void showAllElementsLS(){
		showAllElementsLS(currentDirectory);
	}
	public void showAllElementsLS(FSElement element){
		if (element instanceof Directory) {
			System.out.println(element.getName()); // for print element
			Directory directory = (Directory) element;
			for (FSElement dir : directory.getChildren()) {
				showAllElementsLS(dir);
				
			}
		} else {
			System.out.println(element.getName());// for print element
		}
	}
	
	
	
	/// This is for sorting the dir - start 
	public void showAllElementsSort(){
		showAllElements(currentDirectory);
	}
	
	public void showAllElementsSort(FSElement element){
		if (element instanceof Directory) {
			System.out.println(element); // for print element
			Directory directory = (Directory) element;
			ArrayList<FSElement> childList = directory.getChildren();
			Collections.sort(childList, new TimeStampComparator());
			for (FSElement dir : childList) {
				showAllElementsSort(dir);
			}
		} else {
			System.out.println(element);// for print element
		}
	}
	
	public void cdDirectory(Directory directory) {
		currentDirectory = directory;
		System.out.println(currentDirectory); // for print element
	}
	
	public void cdDirectory() {
		currentDirectory = this.directory;
		System.out.println(currentDirectory); // for print element
	}
	
	public void getCommandHistoryList(){
		List<Command> lstCommands = commandHistory.getCommandHistoryList();
		for(int i =0; i < lstCommands.size(); i++){
			Command command = (Command) lstCommands.get(i);
			//System.out.println(command.getClass().getName());
			System.out.println(command.getClass().getSimpleName());
		}
	}
	
	public void changeOwner(){
		changeOwner.setOwner(fileOwner);
		System.out.println("Owner Change for : " + changeOwner.getName() + ", Owner Name : " + changeOwner.getOwner());
		fileOwner = null;
		changeOwner = null;
	}
	
	public void makeDir() {
		currentDirectory.addChild(makeDir);
		System.out.println("Directory Created");
		makeDir = null;
	}
	
	public void rmDirectory() {
		currentDirectory.removeChild(makeDir);
		System.out.println("Directory removed");
		makeDir = null;
	}
	
	
	/// This is for sorting the dir - end	
	public void lsExecute() {
		ls.execute();
	}
	public void redoExecute() {
		redo.execute();
	}
	public void cdExecute() {
		cd.execute();
	}
	public void cdExecute(Directory directory) {
		cd.execute(directory);
	}
	
	public void pwdExecute() {
		pwd.execute();
	}
	
	public void dirExecute() {
		dir.execute();
	}
	public void sortExecute() {
		sort.execute();
	}
	
	public void historyExecute() {
		history.execute();
	}
	
	public void chownExecute(FSElement element, String OwnerName) {
		changeOwner = element;
		fileOwner = OwnerName;
		chown.execute();
	}
	
	public void mkdirExecute(Directory directory) {
		makeDir = directory;
		mkdir.execute();
	}
	
	public void rmdirExecute(Directory directory) {
		makeDir = directory;
		rmdir.execute();
	}
}
