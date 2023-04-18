package StringStringBuffer;
import java.util.*;
public class SolutionEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int position=0;
		if(!s.contains("*")) {
			System.out.println(s);
		}else {
			position=s.indexOf("*");
			if(position==0) {
				System.out.println(s.substring(position+2));
			}else if(position==s.length()-1) {
				System.out.println(s.substring(0,position-1));
			}else {
				System.out.println(s.substring(0,position-1)+s.substring(position+2));
			}
		}
	}

}
