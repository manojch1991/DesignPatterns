package com.hw;

import java.util.ArrayList;

public class Directory implements FSElement {
	private String name;
	private int size;

	ArrayList<FSElement> children;

	@Override
	public void accept(FSVisitor visitor) {
		for (FSElement e : children) {
			e.accept(visitor);
		}
		visitor.visit(this);

	}

	public Directory(String name, int size) {
		super();
		this.size = size;
		this.name = name;
		children = new ArrayList<FSElement>();
	}

	public void add(FSElement element) {
		children.add(element);
	}

	@Override
	public int getDiskUtil() {
		return size;
	}

	public String getName() {
		return name;
	}
}
