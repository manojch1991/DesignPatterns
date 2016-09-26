package com.hw;

public interface FSVisitor {
	public void visit(Directory directory);
	public void visit(File file);
	public void visit(Link link);
}
