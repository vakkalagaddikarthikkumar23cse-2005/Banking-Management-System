
import java.util.Scanner;

public class BankingApp {

    static String accountHolder = "";
    static double balance = 0;
    static boolean accountCreated = false;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("================================");
        System.out.println("   BANKING MANAGEMENT SYSTEM");
        System.out.println("================================");

        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    accountHolder = sc.nextLine();
                    balance = 0;
                    accountCreated = true;
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount Deposited Successfully!");
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful!");
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;

                case 4:
                    if (!accountCreated) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.println("Account Holder: " + accountHolder);
                        System.out.println("Available Balance: " + balance);
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using our Banking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
