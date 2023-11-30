package com.divisosoft.trainproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainDetails{
	
	Scanner scan = new Scanner(System.in);
	
	List<TrainInfo> trainList = new ArrayList<>();
	
	public void printDetails(){
		System.out.println("enter the train number");
		int numb = Integer.parseInt(scan.nextLine());
		TrainInfo testobj = new TrainInfo();
		testobj.setNumber(numb);
			if(trainList.contains(testobj)){
				for(TrainInfo traincheck:trainList){
					if(traincheck.equals(testobj)){
						System.out.println(traincheck);
					}
				}
			}
			else{
				System.out.println("train not found");
			}
		}
		
		
	public void printAllTrain(){
		/*for(TrainInfo allTrain:trainList){
			System.out.println(allTrain);*/
			
		trainList.forEach(n->System.out.println(n));
		//}
		
	}
	
	public void getTrainBetweenStations(){
		System.out.println("ENTER FROM STATION");
		String fromStation = scan.nextLine();
		System.out.println("ENTER DESTINATION STATION");
		String toStation = scan.nextLine();
		for(TrainInfo getTrain:trainList){
			if(getTrain.getFromLocation().equalsIgnoreCase(fromStation)&&getTrain.getDestination().equalsIgnoreCase(toStation)){
				System.out.println(getTrain);
			}
		}
	}	
	
	
	
}