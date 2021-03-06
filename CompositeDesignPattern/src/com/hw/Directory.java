package com.hw;

import java.util.ArrayList;
import java.util.Date;

public class Directory extends FSElement {

	private ArrayList<FSElement> children;

	public Directory(String name, String owner, Date createddate, Date lastModified,int size) {
		super(name, owner, createddate, lastModified, size);
		children = new ArrayList<FSElement>();
	}

	public ArrayList<FSElement> getChildren() {
		return children;
	}

	public void add(FSElement e) {
		children.add(e);
	}

}
