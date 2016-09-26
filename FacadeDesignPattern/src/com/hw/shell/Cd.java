package com.hw.shell;

import com.hw.Directory;
import com.hw.FileSystem;

public class Cd implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.cdDirectory();
		fs.getCommandHistory().push(this);
	}

	
	public void execute(Directory directory) {
		FileSystem fs = FileSystem.getInstance();
		fs.cdDirectory(directory);
	}
}
