public class TrainInfo
{
private String name;
private int trainNumber;
private String fromLocation;
private String destination;

public void setName(String name)
{
	this.name = name;
}

public String getName()
{
	return name;	
}

public void setTrainNumber(int trainNumber)
{
	this.trainNumber = trainNumber;
}

public int getTrainNumber()
{
	return trainNumber;
}
	
public void setFromLocation(String fromLocation)
{
	this.fromLocation = fromLocation;
}

public String getFromLocation()
{
	return fromLocation;
}

public void setDestination(String destination)
{
	this.destination = destination;
}

public String getDestination()
{
	return destination;
}
}