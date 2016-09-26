package com.hw;

public class SizeCountingVisitor implements FSVisitor{
	private int totalSize = 0;
	@Override
	public void visit(Directory directory) {
		totalSize += directory.getDiskUtil();
		
	}

	@Override
	public void visit(File file) {
		totalSize += file.getDiskUtil();
		
	}

	@Override
	public void visit(Link link) {
		totalSize += link.getDiskUtil();
		
	}

	public int getTotalSize() {
		return totalSize;
	}
}
