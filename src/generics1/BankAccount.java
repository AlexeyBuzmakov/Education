package generics1;

public class BankAccount <T>{
    private T balance;

    public BankAccount(T balance) {
        this.balance = balance;
        System.out.println("На вашем счёте: " + balance);
    }
}
