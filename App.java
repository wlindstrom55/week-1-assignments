
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		double tvPrice = 399.99;
		int walletMoney = 1000;
		float numberFriends = 129;
		float ageYears = 28;
		char middleInitial = 'J';
		
		// Strings
		String firstName = "Will";
		String lastName = "Lindstrom";
		
		// Variables created via operations
		double leftoverWallet = walletMoney - tvPrice;
		float friendsPerYear = numberFriends / ageYears;
		
		// Print variables with descriptions
		System.out.println("The cost of the new television is: " + "$" + tvPrice);
		System.out.println("The amount of money I have is: " + "$" + walletMoney);
		System.out.println("The number of friends I have is: " + numberFriends);
		System.out.println("I am " + ageYears + " years old.");
		System.out.println("My first name is: " + firstName);
		System.out.println("My last name is: " + lastName);
		System.out.println("My middle initial is: " + middleInitial);
		System.out.println("My full name is: " + firstName + " " + middleInitial + " " + lastName);
		System.out.println("The amount of cash I have left after buying the TV is: " + "$" + leftoverWallet);
		System.out.println("I've made roughly " + friendsPerYear + " friends per years of my life.");
		
		
		
	}

}
