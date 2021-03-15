import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
	//we need to print 1-255
	public static void getArray() {
		int i = 1;
		while(i < 256) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void printOdd() {
		for(int x = 1; x < 256; x++) {
			if(x % 2 == 1) {
				System.out.println(x);
			}
		}
	}
	//print 0-255. Include sum so far. NO ARRAYS
	public static int printSum() {
		int sum = 0;
		for(int i = 1; i < 256; i++) {
			sum += i;
			System.out.println("Number:" + i + " Sum:" + sum);
		}
		return sum;
	}
	
	public static void iterateArr(int[] nums) {
		for(int val : nums) {
			System.out.println(val);
		}
	}
	
	public static void findMax(int[] nums) {
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max)
				max = nums[i];
		}
		System.out.println("The max value in the array is:" + max);
	}
	
	public static int GetArraySum(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	public static double findAverage(int [] nums) {
		int sum = GetArraySum(nums);
		double avg = (double)sum/nums.length;
		System.out.println(String.format("Sum: %d, Average: %f", sum, avg));
		return avg;
	}
	
	public static ArrayList<Integer> OddArray() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i<=255; i++) {
			if(i % 2 !=0)
				nums.add(i);
		}
		System.out.println(nums);
		return nums;
	}
	
	public static void greaterThanY(int[]nums, int y) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > y) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void SquareArray(int[] nums) {
		for(int i = 0; i <nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void noNegatives(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0)
				nums[i] = 0;
		}
	}
	
	public static void MaxMinAvg(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		int sum = GetArraySum(nums);
		double avg = (double)sum/nums.length;
		for(int a = 0; a < nums.length; a++) {
			if(nums[a] < min)
				min = nums[a];
			}
		for(int b = 0; b < nums.length; b++) {
			if(nums[b] > max)
				max = nums[b];
			}
		System.out.println(String.format("Max: %d, Min: %d, Average: %f", max, min, avg));
	}
	
	public static void ShiftArrayValues(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			nums[i-1] = nums[i];
		}
		nums[nums.length - 1] = 0;
		System.out.println(Arrays.toString(nums));
	}
}
