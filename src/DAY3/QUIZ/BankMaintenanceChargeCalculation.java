package DAY3.QUIZ;
import java.util.Scanner;

class Account {
    String name, number, startDate;
    float balance;

    Account(String name, String number, float balance, String startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
}

interface MaintenanceCharge {
    float computeMaintenanceCharge(int n);
}

class CurrentAccount extends Account implements MaintenanceCharge {
    CurrentAccount(String name, String number, float balance, String startDate) {
        super(name, number, balance, startDate);
    }

    public float computeMaintenanceCharge(int n) {
        return 100 * n + 200;
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {
    SavingsAccount(String name, String number, float balance, String startDate) {
        super(name, number, balance, startDate);
    }

    public float computeMaintenanceCharge(int n) {
        return 2 * 50 * n + 50;
    }
}

public class BankMaintenanceChargeCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");

        int choice = sc.nextInt();

        System.out.println("Name");
        String name = sc.next();

        System.out.println("Account Number");
        String number = sc.next();

        System.out.println("Account Balance");
        float balance = sc.nextFloat();

        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        String date = sc.next();

        System.out.println("Enter the Years");
        int years = sc.nextInt();

        if (choice == 1) {
            CurrentAccount a =
                new CurrentAccount(name, number, balance, date);

            System.out.printf(
                "Maintenance Charge For Current Account %.2f",
                a.computeMaintenanceCharge(years)
            );
        } else {
            SavingsAccount a =
                new SavingsAccount(name, number, balance, date);

            System.out.printf(
                "Maintenance Charge For Savings Account %.2f",
                a.computeMaintenanceCharge(years)
            );
        }

        sc.close();
    }
}