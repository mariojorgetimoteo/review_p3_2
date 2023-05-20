package exercicio_2;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amout) {

        if (amout > getWithdrawLimit()) {
            throw new RuntimeException("Erro de saque: A quantia excede o limite de saque");
        }

        if (amout > getBalance()) {
            throw new RuntimeException("Erro de saque: Saldo insuficiente");
        }

    }

}
