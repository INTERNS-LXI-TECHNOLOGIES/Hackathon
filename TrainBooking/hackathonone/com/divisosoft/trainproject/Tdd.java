package com.divisosoft.trainproject;
import java.util.Scanner;
import java.util.List;

public class Tdd{

	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	
	TrainInfo train1 = new TrainInfo("Kerala Express",12625,"Thiruvananthapuram Central","Ernakulam Junction ");
	TrainInfo train2 = new TrainInfo("Vanchinad Express",16303,"Ernakulam Junction ","Kottayam");
	TrainInfo train3 = new TrainInfo("Kottayam-Kollam Passenger",56387,"Kottayam","Kollam");
	TrainInfo train4 = new TrainInfo("Malabar Express",16629,"Ernakulam Junction ","Kozhikode");
	TrainInfo train5 = new TrainInfo("Parasuram Express",16649,"Thiruvananthapuram Central","Kannur");
	TrainInfo train6 = new TrainInfo("Trivandrum Mail ",12623,"Thiruvananthapuram Central","Chennai Central");
	TrainInfo train7 = new TrainInfo("Kottayam-Kollam Passenger",88888,"Kottayam","Kollam");
	
	
	TrainDetails train = new TrainDetails();
	
	train.trainList.add(train1);
	train.trainList.add(train2);
	train.trainList.add(train3);
	train.trainList.add(train4);
	train.trainList.add(train5);
	train.trainList.add(train6);
	train.trainList.add(train7);

	boolean check =true;
	while(check){
	System.out.println("PRESS 1 TO SHOW ALL TRAIN DETAILS \nPRESS 2 TO SEARCH TRAIN SHOW TRAIN \nPRESS 3 TO SEARCH TRAIN BETWEEN YOUR STATION");
	String opt = scan.nextLine();
		switch(opt){
		case "2":train.printDetails();
		break;
	
		case "1":train.printAllTrain();
		break;	
	
		case "3":train.getTrainBetweenStations();
		break;
		
		default:System.out.println("PLEASE ENTER PROPER NUMBER");
		break;
		}
		System.out.println("DO YOU WANT TO CONTINUE ?(YES/NO)");
		String ask = scan.nextLine();
		if(ask.equalsIgnoreCase("yes")){
			check = true;
		}
		else{
			check= false;
		}
	}
	}
}