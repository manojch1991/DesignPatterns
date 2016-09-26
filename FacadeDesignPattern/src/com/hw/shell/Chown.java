package com.hw.shell;

import com.hw.FileSystem;

public class Chown implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.changeOwner();
	}
}
