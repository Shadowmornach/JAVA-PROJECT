import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        userDetails();
    }

    public static void userDetails() {
        // Correct username and password for comparison
        String UserName = "SHADOW";
        String Password = "deman123";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter NAME: ");
        String userName = scanner.nextLine(); // Read the username input

        System.out.print("Enter PASSWORD: ");
        String password = scanner.nextLine(); // Read the password input

        // Check if input matches the correct values
        if (userName.equals(UserName) && password.equals(Password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid login");
        }

        // Close the Scanner object
        scanner.close();
    }
}
