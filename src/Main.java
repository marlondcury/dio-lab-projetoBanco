//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaPoupanca();
        Conta cc1 = new ContaCorrente();

        cc1.extrato();
        cc1.depositar(100.0);
        cc.extrato();
        cc1.transferir(cc,50);
        cc.extrato();
        cc1.extrato();


    }
}