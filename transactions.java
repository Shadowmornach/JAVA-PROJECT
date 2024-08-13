import java.util.Scanner;

public class transactions {
    public static void main(String[] args) {
        // Predefined details
        String NAME = "SHADOW";
        String MOBILE_NUMBE = "0772046722";
        String PI = "5634";
        String id_numbe = "123445568";
        String AGENT_NAME = "John Smith";
        String AGENT_STORE_NUMBER = "9847346";
        String AGENT_PASSWORD = "4636";
        String AGENT_NUMBER = "0711216729";

        // Initialize balance
        double balance = 0.0;

        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Option panel
        while (true) {
            System.out.println("\n=== Transaction Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Deposit
                    System.out.println("Enter MOBILE_NUMBER:");
                    String MOBILE_NUMBER = scanner.nextLine();

                    System.out.println("ENTER ID_NUMBER:");
                    String id_number = scanner.nextLine();

                    System.out.println("ENTER AMOUNT TO BE DEPOSITED:");
                    String depositInput = scanner.nextLine();
                    double AMOUNT = Double.parseDouble(depositInput);

                    System.out.println("ENTER PIN:");
                    String PIN = scanner.nextLine();

                    // Perform deposit checks
                    if (AMOUNT <= 50) {
                        System.out.println("Insufficient amount for deposit.");
                    } else if (AMOUNT > 700000) {
                        System.out.println("Amount you want to deposit is over the limit. Please try a lower amount.");
                    } else if (PI.equals(PIN) && id_numbe.equals(id_number) && MOBILE_NUMBE.equals(MOBILE_NUMBER)) {
                        balance += AMOUNT; // Update balance
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid details for deposit, please try again.");
                    }
                    break;

                case 2: // Withdraw
                    System.out.println("Enter Agent_number:");
                    String Agent_numbe = scanner.nextLine();

                    System.out.println("Enter Agent_store_number:");
                    String Agent_storenumbe = scanner.nextLine();

                    System.out.println("Enter Agent_password:");
                    String Agent_passwo = scanner.nextLine();

                    System.out.println("ENTER AMOUNT TO BE WITHDRAWN:");
                    String withdrawInput = scanner.nextLine();
                    double Amoun = Double.parseDouble(withdrawInput);

                    // Perform withdrawal checks
                    if (Amoun < 50) {
                        System.out.println("Insufficient amount for withdrawal.");
                    } else if (Amoun > 300000) {
                        System.out.println("Amount exceeds the maximum limit for withdrawal.");
                    } else if (AGENT_NUMBER.equals(Agent_numbe) && AGENT_STORE_NUMBER.equals(Agent_storenumbe) && AGENT_PASSWORD.equals(Agent_passwo)) {
                        if (Amoun > balance) {
                            System.out.println("Insufficient funds for withdrawal.");
                        } else {
                            balance -= Amoun; // Update balance
                            System.out.println("Withdrawal successful.");
                        }
                    } else {
                        System.out.println("Invalid agent details for withdrawal, please try again.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.printf("Current balance: %.2f\n", balance);
                    break;

                case 4: // Exit
                    System.out.println("Exiting the system. Thank you!");
                    scanner.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
