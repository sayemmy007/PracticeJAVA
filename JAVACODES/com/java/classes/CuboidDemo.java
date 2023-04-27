package com.java.classes;

public class CuboidDemo {
	
  int width;
  int height;
  int depth;
  
  CuboidDemo(int width, int height, int depth){
	  this.width = width;
	  this.height = height;
	  this.depth = depth; 
  }
  CuboidDemo(int width, int height){
	  this.width = width;
	  this.height = height;
	  this.depth = 10; 
  }
  CuboidDemo(int dimension){
	  width = dimension;
	  height = dimension;
	  depth = dimension; 
  }
  CuboidDemo(){
	  this.width = 10;
	  this.height = 10;
	  this.depth = 10; 
  }
  
  
  int volume()//behaviour
  {
	return width*height*depth;  
  }

	
	public static void main(String[] args) {
		int volume;
		
		CuboidDemo Cuboid1 = new CuboidDemo(10,20,30);
		volume = Cuboid1.volume();
		System.out.println("cuboid 1:" +volume);
		
		CuboidDemo Cuboid2 = new CuboidDemo(10,20);
		volume = Cuboid2.volume();
		System.out.println("cuboid 2:" +volume);
		
		CuboidDemo Cuboid3 = new CuboidDemo(10);
		volume = Cuboid3.volume();
		System.out.println("cuboid 3:" +volume);
		
		CuboidDemo Cuboid4 = new CuboidDemo();
		volume = Cuboid4.volume();
		System.out.println("cuboid 4:" +volume);
		
		
	}

}
