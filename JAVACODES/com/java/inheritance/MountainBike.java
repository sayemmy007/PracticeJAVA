package com.java.inheritance;

public class MountainBike extends Bicycle {

	public int seatHeight; ;
	
	public MountainBike(int startHeight, int startGear,int startSpeed) {
		super(startGear,startSpeed );
		this.seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		
	}
}
