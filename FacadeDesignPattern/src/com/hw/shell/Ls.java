package com.hw.shell;

import com.hw.FileSystem;

public class Ls implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.showAllElementsLS();
		fs.getCommandHistory().push(this);
		
	}

}
