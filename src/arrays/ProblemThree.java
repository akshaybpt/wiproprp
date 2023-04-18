package arrays;

import java.util.*;

public class ProblemThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int j=0;
		for(int i=0;i<5;i++) {
			if(n==arr[i]) {
				System.out.println(i);
				j++;
				break;
			}
			
		}
		if(j==0) {
			System.out.println(-1);
		}

	}

}
