package Model.Carrinho;

import Model.Produtos.Produto;
import Model.Regras.Imposto;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Produto> produtos = new ArrayList<>();

public void adicionarItem(ArrayList<Produto> ListaPedido, Produto p){
    ListaPedido.add(p);
}

public void calcularTotal(ArrayList<Produto> Lista) {
    double total = 0;

    for (Produto produto : Lista) {
        if (produto instanceof Imposto){
            ((Imposto) produto).CalcularImpostos();
        }
        total += produto.getPreco();
        System.out.println(total);
        }
    }
}
