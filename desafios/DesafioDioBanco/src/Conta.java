import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

        private static final int AGENCIA_PADRAO = 0001;
        //constante - classe estática para que seja uma informação que tenha relação com a classe conta corrente e não com a instancia
        private static int SEQUENCIAL= 1;

        protected int agencia;
        protected int numero;
        protected double saldo;

        //Conceito de composição - uma conta tem um cliente
        protected Cliente cliente;

        private List<Emprestimo> emprestimos;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        //adicionando o incremental na conta para que o número mude a cada criação
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void solicitarEmprestimo(double valor, double taxaJuros, int numeroParcelas) {
        Emprestimo emprestimo = new Emprestimo(valor, taxaJuros, numeroParcelas);
        emprestimos.add(emprestimo);
        saldo += valor;
    }

    public void pagarParcelaEmprestimo(int indiceEmprestimo) {
        if (indiceEmprestimo >= 1 && indiceEmprestimo <= emprestimos.size()) {
            Emprestimo emprestimo = emprestimos.get(indiceEmprestimo - 1);
            if (saldo >= emprestimo.getValorParcela()) {
                emprestimo.pagarParcela();
                saldo -= emprestimo.getValorParcela();
            } else {
                System.out.println("Saldo insuficiente para pagar a parcela do empréstimo.");
            }
        }
    }
}
