package com.hw;

public class Container {

	float price;
	Size size;

	public Container(Size s) {
		this.size = s;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
}
