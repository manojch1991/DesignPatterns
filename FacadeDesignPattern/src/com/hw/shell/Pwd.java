package com.hw.shell;

import com.hw.FileSystem;

public class Pwd implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		System.out.println(fs.getDirectory().getName());
		fs.getCommandHistory().push(this);
	}

}
