package StringStringBuffer;

import java.util.*;
public class SolutionFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()%2==0) {
			System.out.println(s.substring(0,s.length()/2));
		}else {
			System.out.println("null");
		}
		}

}
