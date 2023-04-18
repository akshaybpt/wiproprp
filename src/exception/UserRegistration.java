package exception;

import java.util.Scanner;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India cannot be registered");
	}
}

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of user :");
		String name = sc.nextLine();
		
		System.out.print("Enter country name :");
		String countryName = sc.nextLine();
		
		UserRegistration regs = new UserRegistration();
		try {
			regs.registerUser(name, countryName);
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
