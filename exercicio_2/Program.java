package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta: ");
        System.out.println("Número: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque : ");
        double withdraw = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdraw);
        System.out.println("Informe a quantia a sacar: ");
        double amout = sc.nextDouble();
        
        try {
            acc.withdraw(amout);
            System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
