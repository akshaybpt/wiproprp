package flowControlStatement;

public class ProblemFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch= '%';
		
		 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            System.out.println(ch + " is an alphabet");
	        }
	        else if (ch >= '0' && ch <= '9') {
	            System.out.println(ch + " is a number");
	        }
	        else {
	            System.out.println(ch + " is a special character");
	        }

	}

}
