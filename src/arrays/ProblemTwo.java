package arrays;

import java.util.*;

public class ProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("maximum :"+arr[4]);
		System.out.println("minimum :"+arr[0]);


	}

}
