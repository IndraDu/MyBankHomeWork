package controller;

import entity.User;

public class Bank {
    private User user;
    public String setActiveUser (User user) {
        this.user = user;
        return "User update successful!";
    }

    public double getUserBalance() {
        return user.getBalance();
    }

    public String creditUser(double amount){
        double newBalance = user.getBalance() + amount;
        this.user.setBalance(newBalance);
        return amount + " euros added to your balance";
    }
}
