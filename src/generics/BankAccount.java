package generics;

public class BankAccount <T>{
    private T balance;

    public T showBalance(T balance) {
        return balance;
    }
}
