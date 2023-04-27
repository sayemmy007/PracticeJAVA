package com.java.abstraction;

public abstract class GraphicObject {
	int x,y;
  
  void moveTo(int newX, int newY) {
	  System.out.println("Move to x: " +x+ "and y:" +y);
  	}
  
	abstract void draw();
	abstract void resize();


	public static void main(String[] args) {
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
	
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}
}