package com.hw.shell;

import com.hw.FileSystem;

public class Dir implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.showAllElements();
		fs.getCommandHistory().push(this);
	}


}
