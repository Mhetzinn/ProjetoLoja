package Model.Produtos;

import Model.Regras.Imposto;

public class ProdutoEletronico extends Produto implements Imposto {
    public double taxa;

    public ProdutoEletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }
    @Override
    public double CalcularImpostos() {
        double ICMS = this.preco * 0.15;
        double IPI = this.preco * 0.20;

        double ImpostoTotal = ICMS + IPI;

        taxa = preco + ImpostoTotal;

        return taxa;
    }

    public double getImposto() {
        return taxa;
    }
}

