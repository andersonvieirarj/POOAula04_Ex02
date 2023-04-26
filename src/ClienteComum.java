public class ClienteComum extends Pessoa {
    public double saldo;
    public ClienteComum(){}
    public ClienteComum(double saldo) {
        this.saldo = saldo;
    }
    public ClienteComum (String nome, int numeroConta, double saldo) {
        super.nome = nome;
        super.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}
