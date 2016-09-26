package com.hw.shell;

import com.hw.FileSystem;

public class Redo implements Command {

	@Override
	public void execute() {
		FileSystem fs = FileSystem.getInstance();
		Command command =  fs.getCommandHistory().pop();
		
		if(command instanceof Ls) {
			fs.lsExecute();
		} else if(command instanceof Pwd) {
			fs.pwdExecute();
		}else if(command instanceof Cd) {
			fs.cdExecute();
		}
	}

}
