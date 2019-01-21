package com.naztech;

import java.util.Scanner;

public enum Month {
	
	JANUARY("January", 31),
	FEBRUARY("February", 28),
	MARCH("March", 31),
	APRIL("April", 30),
	MAY("May", 31),
	JUNE("June", 30),
	JULY("July", 31),
	AUGUST("August", 31), 
	SEPTEMBER("September", 30), 
	OCTOBER("October", 31),
    NOVEMBER("November", 30), 
    DECEMBER("December", 31);
	
	
	
	private String Title; 
    private int DaysInMonth;

     Month(String title, int days)
     {
         this.Title=title;
         DaysInMonth=days;
     }
     
     public int daysInMonth(){
         return this.DaysInMonth;
     }
     public String getShortName(){
         return this.Title.substring(0, 3);
     }
     public static Month parse(String v){
    	 
     if(v==null || v.isEmpty()) 
    	 return null;  
     
     v=v.toUpperCase();
     
     try {
    	 
    	 return Month.valueOf(v);
     }catch(IllegalArgumentException e)
     {
    	 for(Month month : Month.values())
    	 {
    		 if(month.getShortName().toUpperCase().equals(v))
    		 {
    			 return month;
    		 }
    	 }
     }
     return null;
    
     
     
 }
     public static void main(String[] args){
    	 
    	String s; 
 		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter a month (like mar or march)"); 
  		s = sc.nextLine(); 
  		
  		System.out.println(Month.parse(s).daysInMonth()); 
  		
  		
  		
         
         
     }
     
     
 
 }
     


