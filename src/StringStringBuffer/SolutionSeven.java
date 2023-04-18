package StringStringBuffer;

import java.util.Scanner;

public class SolutionSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s= sc.next();
		if(s.charAt(0)!='x'&&s.charAt(s.length()-1)!='x') {
			System.out.println(s);
		}else {
			if(s.charAt(0)=='x'&&s.charAt(s.length()-1)=='x') {
				System.out.println(s.substring(1,s.length()-2));
			}else if(s.charAt(0)=='x') {
				System.out.println(s.substring(1));
			}else {
				System.out.println(s.substring(0,s.length()-2));
			}
			
		}

	}

}
