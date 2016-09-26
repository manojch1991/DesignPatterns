package com.hw.shell;

import com.hw.FileSystem;

public class History implements Command{

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		fs.getCommandHistoryList();
	}

}
