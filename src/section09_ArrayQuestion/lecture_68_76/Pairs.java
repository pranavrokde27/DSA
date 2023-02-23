package section09_ArrayQuestion.lecture_68_76;
//Write a program to find all pairs of integers whose  of integers is equal to a given number?

import java.util.Arrays;

public class Pairs {
	
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0;i < nums.length;i++) {
			for(int j = i+1; i< nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {nums[i],nums[j], target};
				}
			}
		}throw new IllegalArgumentException("No solution found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pairs p = new Pairs();
		int[] inArr = {1,2,3,4,5};
		int[] result = p.twoSum((inArr), 4);
		System.out.println(Arrays.toString(result));
		

	}

}
