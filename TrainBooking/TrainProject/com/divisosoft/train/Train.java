package com.divisosoft.train;

public class Train implements Comparable<Train> 
{
    private String name;
    private int trainNumber;
    private String fromLocation;
    private String destination;

public Train(String name, int trainNumber, String fromLocation, String destination) 
{
        this.name = name;
        this.trainNumber = trainNumber;
        this.fromLocation = fromLocation;
        this.destination = destination;
    }
	
	 public String getName() 
	 {
        return name;
	}

    public int getTrainNumber() 
	{
        return trainNumber;
    }

    public String getFromLocation() 
	{
        return fromLocation;
    }

    public String getDestination() 
	{
        return destination;
    }

  
    public int compareTo(Train other) 
	{
        return Integer.compare(this.trainNumber, other.trainNumber);
    }

  
    public String toString() 
	{
		
		String toString = "Train{" + "name='" + name + '\'' + ", trainNumber=" + trainNumber + ", fromLocation='" + fromLocation + '\'' +", destination='" + destination + '\'' + '}';
        return toString;
    }
}