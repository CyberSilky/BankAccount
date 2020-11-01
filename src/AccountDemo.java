import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args){
        Account account1 = new Account("12345", "Bob", "Smith", 1200.00);

        System.out.println(account1.toString());

        Account account2 = new Account();

        //create scanner class to retrieve user information
        account2.setFirstName("FirstName");
        account2.setLastName("LastName");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter account number >> ");
        account2.setAccountNumber(input.nextLine());
        System.out.print("Please enter balance >> ");
        account2.setBalance(input.nextDouble());

        System.out.println(account2.toString());
    }
}

