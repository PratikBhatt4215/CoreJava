package Q15;

import java.util.HashSet;
import java.util.Scanner;

public class Basements {
	Scanner sc = new Scanner(System.in);
	
	
	HashSet<Integer> hs = new HashSet<>(15);
	
	
	public void bikes() {

		System.out.println("\t BASEMENT 1 FOR BIKES :");
		
		System.out.println("Total slot available :" +hs.size());
		System.out.println();
		System.out.println("Enter how many bikes slots you want");
		
		int bikesl = sc.nextInt();
		
		for(int i =0 ; i<=bikesl; i++) {
			
			int bike = sc.nextInt();
			
			hs.add(bike);
			
		}
		Integer[] array = hs.toArray( new Integer[hs.size()] );
		for(int i =0 ;i<=bikesl;i++) {
			System.out.println(" Id of bike is  "+ array[i]+" slots booked successfully for bike type " +i);
		}
		
		System.out.println("Available slot of bikes is: " +(hs.size() - bikesl));
	}

}
