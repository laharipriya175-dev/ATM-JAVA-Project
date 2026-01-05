import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1726;
        int userpin;
        double amount;
        double balance = 20000.89;
        int choice;
        System.out.println("Welcome to SBI");
        System.out.println("_______________________");
        System.out.println("Enter your pin ****");
        userpin = sc.nextInt();
        if (userpin == pin) {

            System.out.println("1.Balance enquiry");
            System.out.println("2.Withdrawl");
            System.out.println("3.cash deposit");
            System.out.println("4.Reset ur pin");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("your account balance: " + balance);
                    break;
                case 2:
                    System.out.println("enter amount: ");
                    amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Please collect ur cash");
                        System.out.println("your remaining balance: " + balance);
                    } else {
                        System.out.println("insufficient balance");
                    }

                    break;
                case 3:
                    System.out.println("enter amount: ");

                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("amount deposited sussesfully");
                    System.out.println("your current balance: " + balance);
                    break;
                default:
                    System.out.println("Invalid choice");
                case 4:
                    System.out.println("enter ur new pin");
                    int newpin = sc.nextInt();

                    if (newpin != pin) {
                        pin = newpin;
                        System.out.println("your new is generated");
                    }

            }
            System.out.println("thank you for visting");

        } else {
            System.out.println("ur pin is incoorecr");
        }
        sc.close();

    }

}
