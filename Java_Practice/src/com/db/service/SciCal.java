package com.db.service;

// we can the math class method directly by the class name because it contain all static methords
//so it is call by call not by instance
public class SciCal {
	public double ln(double x ) {
		return Math.log(x);
	}
	public double log(double x ) {
		return Math.log10(x);
	}
	public double sin(double x ) {
		return Math.sin(x);
	}
	public double cos(double x ) {
		return Math.cos(x);
	}
	public double tan(double x ) {
		return Math.tan(x);
	}
	public double sqrt(double x ) {
		return Math.sqrt(x);
	}
	public double abs(double x ) {
		return Math.abs(x);
	}
	public double expo(double x ) {
		return Math.exp(x);
	}
	public double pow(double x,double y ) {
		return Math.pow(x,y);
	}
}
