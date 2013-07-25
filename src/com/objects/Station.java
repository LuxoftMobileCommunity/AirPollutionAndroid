package com.objects;

public class Station {
 
	public Coordinates statationCoordinates;
	public String name;
	public int id;
	public Station(String name,double x, double y){
		this.statationCoordinates = new Coordinates(x, y);
		this.name = name;
	}
}
