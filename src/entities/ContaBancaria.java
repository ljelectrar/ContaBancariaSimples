package entities;

public class ContaBancaria {
    private int numero;
    private String correntista;
    private double balance;

    public ContaBancaria(int numero, String correntista) {
        this.numero = numero;
        this.correntista = correntista;
        balance = 0.0;
    }

    public ContaBancaria(int numero, String correntista, double balance) {
        this.numero = numero;
        this.correntista = correntista;
        this.balance = balance;
    }

    public int getNumero() {
        return numero;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public double getBalance() {
        return balance;
    }

    public void deposito(double montante) {
        balance += montante;
    }

    public void saque(double montande){
        balance -= (montande + 5.00);
    }

    @Override
    public String toString() {
        return "Número: " + numero +
                ", Correntista: " + correntista +
                ", Balanço: R$ " + balance;
    }
}
