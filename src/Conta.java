public abstract class Conta implements Iconta{

    private double saldo;
    private int agencia;
    private int numero;
    private static int sequencial = 1;
    private static final int AGENCIA_PADRAO = 1;

    public Conta(){
        this.numero = sequencial++;
        this.agencia = AGENCIA_PADRAO;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void sacar(Double saque) {
        saldo -= saque;
    }

    @Override
    public void depositar(Double deposito) {
        saldo += deposito;
    }

    @Override
    public void transferir(Conta conta, double saque) {
        saldo-=saque;
        conta.depositar(saque);
    }

    public void imprimirInfosComuns(){
        System.out.println(String.format("%d", this.agencia));
        System.out.println(String.format("%d", this.numero));
        System.out.println(String.format("%.2f", this.saldo));
    }
}
