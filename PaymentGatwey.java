package mmbank;

//Class that performs transfer of funds between two accounts 

public class PaymentGatwey {

    //method to transfer the given amount from the src to target account.
    public static boolean transfer(Account sender, Account reciever, double amount) {

        boolean status;

        if (sender.getBalance() == amount) {

            sender.withdraw(amount);

            reciever.deposit(amount);

            status = true;
            //If the sender account balance = the given amount then the amount is

        //transferred from the sender to the reciever account and true is returned

        } else {

            status = false;
            //otherwise false is returned.

        }

        return status;

    }
}
