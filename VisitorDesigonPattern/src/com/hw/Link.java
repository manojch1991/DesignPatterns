package com.hw;

public class Link implements FSElement {

	private int size;
	private String name;

	@Override
	public void accept(FSVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public int getDiskUtil() {
		return size;
	}

	public Link(String name, int size) {
		super();
		this.size = size;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
