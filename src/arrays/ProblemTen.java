package arrays;

import java.util.*;

public class ProblemTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array and elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int j=0,k=n-1;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				arr1[j]=arr[i];
				j++;
			}
			else {
				arr1[k]=arr[i];
				k--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
	}

}
