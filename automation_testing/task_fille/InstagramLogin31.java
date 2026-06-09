package task.assignment6;

import java.util.Scanner;

public class InstagramLogin31 
{
	public static void main(String[] args) 
	{

        // Expected credentials
        String correctUsername = "krunal123";
        String correctPassword = "pass@456";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // if/else to check credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login Successful ✅");
        } else {
            System.out.println("Invalid Credentials ❌");
        }

        sc.close();
		
	}

}
