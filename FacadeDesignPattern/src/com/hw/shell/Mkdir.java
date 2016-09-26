package com.hw.shell;

import com.hw.FileSystem;

public class Mkdir implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.makeDir();
		fs.getCommandHistory().push(this);
	}
}
