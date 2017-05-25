import java.util.Scanner;
public class SecretNumber {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Your number is: ");
	int user = scan.nextInt();
	int num1 =50;
	
	while (!(user==num1))
	{
		if (user>num1)
		{
			System.out.println("Your number is too high, try a lower number.");
		}
		else if (user<num1)
		{
			System.out.println("Your number is too low, try a lower number.");
		}
		System.out.println("Your number is: ");
		user = scan.nextInt();
	}
	
	System.out.println("You are correct!");
}
}
