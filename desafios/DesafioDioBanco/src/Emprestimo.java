public class Emprestimo {

    private double valor;
    private double taxaJuros;
    private int numeroParcelas;
    private double valorParcela;
    private double saldoDevedor;
    private int parcelasPagas;


    public Emprestimo(double valor, double taxaJuros, int numeroParcelas) {
        this.valor = valor;
        this.taxaJuros = 1 + (taxaJuros / 100);
        this.numeroParcelas = numeroParcelas;
        this.saldoDevedor = valor;
        this.valorParcela = calcularValorParcela();
        this.parcelasPagas = 0;
    }

    private double calcularValorParcela() {
        System.out.println(numeroParcelas);
        return (valor * Math.pow(taxaJuros, numeroParcelas));
    }

    public void pagarParcela() {
        if (parcelasPagas < numeroParcelas) {
            double jurosMensal = taxaJuros / 12;
            double jurosParcela = saldoDevedor * jurosMensal;
            double principalParcela = valorParcela - jurosParcela;
            saldoDevedor -= principalParcela;
            parcelasPagas++;
        }
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double getValorParcela() {
        return valorParcela;
    }
}


