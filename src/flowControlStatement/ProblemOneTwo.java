package flowControlStatement;

import java.util.*;
public class ProblemOneTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=23;
		int b=443;
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		 b= sc.nextInt();
		
		if(a%10==b%10) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
