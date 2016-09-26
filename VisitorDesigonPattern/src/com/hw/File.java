package com.hw;

public class File implements FSElement {
	private String name;
	private int size;

	@Override
	public void accept(FSVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int getDiskUtil() {
		return size;
	}

	public File(String name, int size) {
		super();
		this.size = size;
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
