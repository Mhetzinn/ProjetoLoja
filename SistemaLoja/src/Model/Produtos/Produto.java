package Model.Produtos;

import Model.Carrinho.Pedido;

import java.util.ArrayList;

public class Produto extends Pedido {
    public int id;
    public String nome;
    public double preco;

    Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
