package classesAndObject;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerInt(2,3));
		System.out.println(Math.pow(2, 3));
		System.out.println(powerDouble(2,3));
	}
	public static int powerInt(int num1,int num2) {
		int num=1;
		for(int i=0;i<num2;i++) {
			num=num*num1;
		}
		return num;
	}
	public static double powerDouble(double num1,double num2) {
		double num=1;
		for(double i=0;i<num2;i++) {
			num=num*num1;
		}
		return num;
	}

}
