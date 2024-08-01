import java.util.Scanner;

public class deposite {
    public static void main(String[] args) {
        // Define static variables with exact details
        String NAME = "SHADOW";
        String MOBILE_NUMBE = "0772046722";
        String PI = "5634";
        String id_numbe = "123445568";
        String Agent_name = "John Smith";
        String Agent_storenumber = "9847346";
        String Agent_passwor = "4636";
        String Agent_number = "0711216729";

        // Import scanner function
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Enter MOBILE_NUMBER:");
        String MOBILE_NUMBER = scanner.nextLine();

        System.out.println("ENTER ID_NUMBER:");
        String id_number = scanner.nextLine();

        System.out.println("ENTER AMOUNT TO BE DEPOSITED:");
        String deposite = scanner.nextLine();
        double AMOUNT = Double.parseDouble(deposite);

        System.out.println("ENTER PIN:");
        String PIN = scanner.nextLine();

        // Perform checks directly in the main method

        // Check if amount is valid
        if (AMOUNT <= 50) {
            System.out.println("Insufficient amount.");
        } else if (AMOUNT > 700000) {
            System.out.println("Amount you want to deposit is over the limit. Please try a lower amount.");
        } else if (Agent_passwor.equals(Agent_passwor) && id_numbe.equals(id_number) && MOBILE_NUMBE.equals(MOBILE_NUMBER)) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid details, please try again.");
        }

        scanner.close();
    }
}
