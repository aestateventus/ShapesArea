package org.itstep.model;

import org.itstep.model.Shape;

public class Triangle implements Shape {
	
	private int area;
	
	@Override
	public void printArea () {
		System.out.println ("Area of this triangle is" + Math.sqrt(s));
	}
	
	 public static double triangleArea( double a, double b, double c)
	    {
	double s = (a + b + c) / 2;
	 return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
	
	public int getArea () {
		return area;
	}
	
	public void setArea (int area) {
		this.area = area;
	}
	
	
	}
