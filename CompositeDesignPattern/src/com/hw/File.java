package com.hw;

import java.util.Date;

public class File extends FSElement{

	public File(String name, String owner, Date createddate, Date lastModified, int size) {
		super(name, owner, createddate, lastModified, size);
	}

}
