package section08_Project1Arrays.lecture_64_67;

import java.util.Scanner;

public class FindDaysAboveTheAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many day's temperature?:-> ");
		int numDays = sc.nextInt();
		int[] temp = new int[numDays];
		
//		record temperatures and find average
		int sum = 0;
		for(int i = 0; i < numDays; i++)
		{
			System.out.print("Day "+i+"'s high temp:-> ");
			temp[i] = sc.nextInt();
			//int next = sc.nextInt();
			sum +=temp[i];
		}
		
		//Average
		float average = sum/numDays;
		
		//count days above average
		int above = 0;
		for(int i =1; i< temp.length;i++) {
			if(temp[i]>average) {
			above++;
			}
		}
		System.out.println();
		System.out.println("Average Temp = "+average);
		System.out.println(above+" Day's above average");
	}

}
