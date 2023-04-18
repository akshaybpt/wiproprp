package exception;


import java.util.*;

public class SolutionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elemets in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array you want to access");
		int index = sc.nextInt(); 
		try {
			System.out.println("The array element at index "+ index +" = "+ arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}

}
