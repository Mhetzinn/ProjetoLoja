package Model.Produtos;

import Model.Regras.Imposto;

public class ProdutoFisico extends Produto implements Imposto {
    public double TaxaTotal;

    public ProdutoFisico(int id, String nome, double preco){
        super(id, nome, preco);
    }

    @Override
    public double CalcularImpostos() {
        TaxaTotal = preco * 0.1;

        return TaxaTotal;
    }

    public double getTaxa() {
        return TaxaTotal;
    }
}
