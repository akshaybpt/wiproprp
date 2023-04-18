package flowControlStatement;
import java.util.*;
public class ProblemForteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,r=0;
		while(n>0) {
			 r=n%10;
			 sum+=r;
			 n/=10;
			
		}
		System.out.println(sum);
	}

}
