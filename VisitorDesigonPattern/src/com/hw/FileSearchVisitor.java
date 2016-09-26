package com.hw;

import java.util.ArrayList;

public class FileSearchVisitor implements FSVisitor {

	private String extension;
	private ArrayList<File> foundFiles;

	public FileSearchVisitor() {
		foundFiles = new ArrayList<File>();
	}
	@Override
	public void visit(Directory directory) {
		return;

	}

	@Override
	public void visit(File file) {
		if (file.getName().contains(extension)) {
			foundFiles.add(file);
		}

	}

	@Override
	public void visit(Link link) {
		return;

	}

	public String getExtension() {
		return extension;
	}

	public ArrayList<File> getFoundFiles() {
		return foundFiles;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
}
