package Model.Carrinho;

import Model.Produtos.Produto;

import java.util.ArrayList;

public class Pedido {
    ArrayList<Produto> ListaPedido = new ArrayList<>();
}
public void adicionarItem(ArrayList<Produto> ListaPedido, Produto p){
    ListaPedido.add(p);
}
public double calcularTotal(ArrayList<Produto> Lista){
    double total = 0;

    for(Produto produto: Lista){
        produto.preco += total;
    }
    return total;
}

