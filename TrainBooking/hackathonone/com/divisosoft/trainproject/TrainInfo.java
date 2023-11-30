package com.divisosoft.trainproject;

public class TrainInfo{
	
	private String name;
	private int number;
	private String fromLocation;
	private String destination;

	public TrainInfo(String name,int number,String fromLocation,String destination){
		this.name=name;
		this.number=number;
		this.fromLocation= fromLocation;
		this.destination=destination;
	}
	public TrainInfo(){
		
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setNumber(int number){
		this.number =number ;
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setFromLocation(String FromLocation){
		this.fromLocation=FromLocation;
	}
	
	public String getFromLocation(){
		return fromLocation;
	}

	public void setDestination(String destination){
		this.destination=destination;
	}
	
	public String getDestination(){
		return destination;
	}

	public String toString(){
		String toString="";
		toString= "TRAIN NAME IS : "+name+"\n TRAIN NUMBER IS : "+number+"\n STARTING STATION "+fromLocation+"\n DESTINATION : "+destination+"\n";
		return toString;
	}
	
	public boolean equals(Object obj){
		
		if(((TrainInfo)obj).getNumber()==this.getNumber()){
			return true;
		}
		else{
			return false;
		}	
	}
	
}