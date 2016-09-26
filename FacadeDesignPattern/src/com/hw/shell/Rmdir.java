package com.hw.shell;

import com.hw.FileSystem;

public class Rmdir implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.rmDirectory();
		fs.getCommandHistory().push(this);
	}

}
