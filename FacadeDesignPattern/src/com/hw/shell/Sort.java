package com.hw.shell;

import com.hw.FileSystem;

public class Sort implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.showAllElementsSort();
		fs.getCommandHistory().push(this);
	}

}
