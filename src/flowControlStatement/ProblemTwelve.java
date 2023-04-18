package flowControlStatement;
import java.util.*;
public class ProblemTwelve {
	public static void main(String [] agrs) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<n/2+1;i++) {
			if(n%i==0) {
				isPrime= false;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
