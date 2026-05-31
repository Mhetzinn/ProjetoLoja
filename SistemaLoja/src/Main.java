import Model.Carrinho.Pedido;
import Model.Produtos.Produto;
import Model.Produtos.ProdutoEletronico;
import Model.Produtos.ProdutoFisico;
import Model.Carrinho.Pedido;

import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
      ArrayList<Produto> produtos = new ArrayList<>();

      Produto sueter = new ProdutoEletronico(1, "Sueter Ralph Lauren", 1300);
      Produto applewatch = new ProdutoEletronico(2, "Apple Watch SE 2nd", 2200);

      produtos.add(sueter);
      produtos.add(applewatch);
  }
}
