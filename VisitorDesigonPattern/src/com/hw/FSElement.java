package com.hw;

public interface FSElement {
	public void accept(FSVisitor visitor);
	public int getDiskUtil();
}
