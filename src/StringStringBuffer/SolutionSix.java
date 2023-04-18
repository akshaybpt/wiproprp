package StringStringBuffer;

import java.util.*;
public class SolutionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
		String s1="";
		String s2= sc.next();
		
		if(s1.length()>s2.length()) {
			System.out.println((s2.concat(s1)).concat(s2));
		}else {
			System.out.println((s1.concat(s2)).concat(s1));
			
		}
	}

}
