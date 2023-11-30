import java.util.List ;
import java.util.ArrayList ;
import java.util.stream.Stream ;
import java.util.stream.Collectors ;
import java.util.Scanner ;

public class Tdd
{
	public static void main(String[] args)
	{
		System.out.println("\t"+"Where is my train"+"\n");
		Scanner scan = new Scanner(System.in) ;
		
		List<Train> trains = new ArrayList<>();
		
		trains.add(new Train("Venad Express ",16302,"Trivandrum Cntl","Shoranur Junction"));
		trains.add(new Train("Maveli Express",16603,"Mangalore Central","Trivandrum Cntl"));
		trains.add(new Train("Kochuveli Express",16315,"Bangalore City Junction","Trivandrum Cntl"));
		trains.add(new Train("Ernakulam - Kollam MEMU",66307,"Ernakulam Junction","Kollam Junction"));
		trains.add(new Train("Netravati Express",16346,"Trivandrum Central","Lokmanya Tilak Terminus"));
		trains.add(new Train("Rajdhani Express",12431,"Trivandrum Cntl","Hazrat Nizamuddin"));
		trains.add(new Train("Venad Express",16301,"Shoranur Junction","Trivandrum Cntl"));
		trains.add(new Train("Maveli Express",16602,"Trivandrum Cntl","Trivandrum Cntl"));
		trains.add(new Train("Kochuveli Express",16314,"Trivandrum Cntl","Bangalore City Junction"));
		trains.add(new Train("Kerala Express",12625,"Trivandrum Cntl","New Delhi"));
		trains.add(new Train("Jan Shatabdi",12075,"Calicut","Trivandrum Central"));
		trains.add(new Train("Netravati Express",16347,"Lokmanya Tilak Terminus","Trivandrum Central"));
		
		System.out.println("Enter the Train Number ");
		int number = scan.nextInt();
		
		List<Train> Trainno = trains.stream()
		.filter(train ->train.getTrainNumber()==number)
		.collect(Collectors.toList());
		
		Trainno.stream().forEach(train -> System.out.println(train));
	
	}
}
		
