package com.test; 

public class CalcTest { 
	private int param1 = 0; 
	private int param2 = 0; 
	
	public int getParam1() { 
		return param1; 
		} 
	
	public void setParam1(int param1) { 
		this.param1 = param1; 
		} 
	
	public int getParam2() { 
		return param2; 
		} 
	
	public void setParam2(int param2) { 
		this.param2 = param2; 
		} 
	
	public int result() { 
		System.out.println("여기2");
		System.out.println("여기3");
		System.out.println("여기4");
		System.out.println("여기5");
		System.out.println("here 6");
		System.out.println("here 7");
		System.out.println("here 8");
		
		return param1 + param2; 
		} 
	}