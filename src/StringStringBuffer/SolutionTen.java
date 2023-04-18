package StringStringBuffer;

import java.util.*;
public class SolutionTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		String s=sc.next();
		int n=sc.nextInt();
		StringBuilder s1= new StringBuilder();
		for(int i=0;i<n;i++) {
			s1.append(s.substring(s.length()-n));
		}
		System.out.println(s1.toString());
	}

}
