import controller.Bank;
import entity.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("454545", 50, "Indra", "female");
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();
        bank.setActiveUser(user);

        System.out.println("Welcome to bank, " + user.name + "!");
        System.out.println("Current balance: " + bank.getUserBalance());

        String response = bank.creditUser(200);
        System.out.println(response);
        System.out.println(bank.creditUser(50));
        System.out.println(bank.creditUser(70));
        System.out.println(bank.creditUser(20));
        System.out.println(bank.creditUser(100));

        System.out.println("Current balance: " + bank.getUserBalance());
    }


}
