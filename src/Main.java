import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com o número da conta: ");
        int numConta = sc.nextInt();

        System.out.println("Entre com o nome do correntista:");
        sc.nextLine();
        String nomeCorrentista = sc.nextLine();

        System.out.println("Vai ter um primeiro depósito? (Y/N)");
        String primDep = sc.next();

        ContaBancaria correntista;

        if (primDep.equals("y") || primDep.equals("Y")){
            System.out.println("Entre com o valor do depósito:");
            double valorDepositoInicial = sc.nextDouble();
            correntista = new ContaBancaria(numConta, nomeCorrentista, valorDepositoInicial);
        }
        else {
            correntista = new ContaBancaria(numConta, nomeCorrentista);
        }

        System.out.println("Dados da conta: " + correntista);

        System.out.println("Entre com um valor de depósito:");
        double deposito = sc.nextDouble();
        correntista.deposito(deposito);
        System.out.println("Dados da conta: (updated) " + correntista);

        System.out.println("Entre com um valor de saque:");
        double saque = sc.nextDouble();
        correntista.saque(saque);
        System.out.println("Dados da conta: (updated) " + correntista);


        //ContaBancaria correntista = new ContaBancaria();
    }
}