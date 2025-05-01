// classe "ContaCorrente"
public class ContaCorrente {
    private int numero;

    private String titular;
    
    private float saldo;
    
    private final float LIMITE_SAQUE = 10000.0f;
    private final float LIMITE_DEPOSITO = 10000.0f;

    // Construtor
    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0f; // Saldo inicial é 0
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    // Método sacar
    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor para saque deve ser positivo.");
        } else if (valor > LIMITE_SAQUE) {
            System.out.println("Erro: O valor máximo para saque por operação é de R$" + String.format("%.2f", LIMITE_SAQUE) + ".");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente.");
        }
    }

    // Método depositar
    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor para depósito deve ser positivo.");
        } else if (valor > LIMITE_DEPOSITO) {
            System.out.println("Erro: O valor máximo para depósito por operação é de R$" + String.format("%.2f", LIMITE_DEPOSITO) + ".");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    // Método consultarSaldo
    public float consultarSaldo() {
        return saldo;
    }
}
