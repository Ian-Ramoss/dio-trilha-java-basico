//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente Ian = new Cliente();
        Ian.setNome("Ian");

        //O polimorfismo entra nessa etapa, ja que posso instanciar como conta corrente/poupança, ou simplesmente como Conta
        Conta cc = new ContaCorrente(Ian);
        Conta poupanca = new ContaPoupanca(Ian);

        cc.depositar(100);

        cc.transferir(100, poupanca);

        cc.solicitarEmprestimo(100,10,2);
        cc.pagarParcelaEmprestimo(0);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println();

        for (Emprestimo emprestimo : cc.getEmprestimos()) {
            System.out.println("Saldo Devedor do Empréstimo: " + emprestimo.getSaldoDevedor());
            System.out.println("Valor da Parcela: " + emprestimo.getValorParcela());
            System.out.println("Parcelas Pagas: " + emprestimo.getParcelasPagas() + "/" + emprestimo.getNumeroParcelas());
        }
    }
}