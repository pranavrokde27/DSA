package section08_Project1Arrays.lecture_64_67;

//	Project:->1-->Arrays_Goals 

import java.util.*;

public class Goals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many day's temperature?:-> ");
		int numDays = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < numDays; i++)
		{
			System.out.print("Day "+i+"'s high temp:-> ");
			int next = sc.nextInt();
			sum += next;
		}
		float average = sum/numDays;
		System.out.println();
		System.out.println("Average Temp = "+average);
	}
}
