package com.hw;

import java.util.Date;

public class FSElement {
	private String name;
	private String owner;
	private Date createdDate;
	private Date lastModified;
	private int size;

	public FSElement(String name, String owner, Date createdDate,
			Date lastModified, int size) {
		super();
		this.name = name;
		this.owner = owner;
		this.createdDate = createdDate;
		this.lastModified = lastModified;
		this.size = size;
	}

	public FSElement() {
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public String getOwner() {
		return owner;
	}

	public Date getcreatedDate() {
		return createdDate;
	}

	public int getSize() {
		return countSize(this);
	}
	
	public int countSize(FSElement element) {
		int totalSize = 0;
		if (element instanceof Directory) {
			Directory directory = (Directory) element;
			for (FSElement dir : directory.getChildren()) {
				totalSize += countSize(dir);
			}
		} else {
			totalSize += element.size;
			
		}
		return totalSize;
	}
	
	public boolean isLeaf() {
		boolean isLeaf  = false;
		if (this instanceof Directory) {
			Directory directory = (Directory) this;
			if(directory.getChildren().size() > 0) {
				isLeaf = true;
			}
		} else {
			isLeaf = false;
		}
		return isLeaf;
	}
	
	@Override
	public String toString() {
		return "FSElement [name=" + name + ", owner=" + owner
				+ ", createdDate=" + createdDate + ", lastModified="
				+ lastModified + ", size=" + size + "]";
	}
}
