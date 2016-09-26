package com.hw.shell;

import java.util.LinkedList;
import java.util.List;

public class CommandHistory {
	Command command;

	List<Command> lstHistory = new LinkedList<Command>(); 
	public void push(Command command) {
		lstHistory.add(command);
		this.command = command;
	}

	public Command pop() {
		return command;
	}
	
	public List<Command> getCommandHistoryList() {
		return lstHistory;
	}
}
