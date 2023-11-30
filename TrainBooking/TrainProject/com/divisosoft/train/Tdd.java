package com.divisosoft.train;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Tdd 
{
    public static void main(String[] args) 
	{
        List<Train> trainList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
	
        trainList.add(new Train("Express 1", 101, "Station A", "Station B"));
        trainList.add(new Train("Superfast 5", 205, "Station C", "Station D"));
        trainList.add(new Train("Local 3", 103, "Station B", "Station E"));
        trainList.add(new Train("Rapid 2", 102, "Station D", "Station A"));
		
		System.out.println("Enter the train number that you want to view");
		int sc =scan.nextInt();
		
		Train selectedTrain = null;
		   for (Train train : trainList) {
            if (train.getTrainNumber()==sc)
				{
                selectedTrain = train;
                break;
            }
        }

        if (selectedTrain != null) 
		{
            System.out.println("\nTrain with Train Number " + sc + ":");
            System.out.println(selectedTrain);
        } 
		else
		{
            System.out.println("\nTrain with Train Number " + sc + " not found.");
		}	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Collections.sort(trainList);

        System.out.println("Sorted Trains by Train Number:");
        trainList.forEach(sort-> System.out.println(sort));
    }
}