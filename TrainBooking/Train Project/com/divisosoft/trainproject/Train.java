package com.divisosoft.trainproject ;

public class Train
{
	String name ;
	int trainnumber ;
	String fromlocation ;
	String destination ;
	
	public Train(String name,int trainnumber,String fromlocation,String destination)
	{
		this.name = name ;
		this.trainnumber = trainnumber ;
		this.fromlocation = fromlocation ;
		this.destination = destination ;
	}
	
	public int getTrainNumber()
	{
		return trainnumber ;
	}
	
	public String toString()
	{
		String toString = "Train number  : "+trainnumber+" Train Name  : "+name+" From  : "+fromlocation+" Destination  : "+destination ;
		return toString ;
	}
}
	
