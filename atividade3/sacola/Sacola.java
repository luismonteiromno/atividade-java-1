package atividade3.sacola;

import atividade3.produto.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma Sacola de Compras de um usuário.
 * Armazena referências a produtos e calcula o valor total da compra.
 */
public class Sacola {
    private final List<Produto> produtos = new ArrayList<>();

    /**
     * Adiciona um produto à sacola.
     * 
     * @param produto Produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    /**
     * Calcula o valor total da sacola somando os preços dos produtos.
     * 
     * @return Valor total da sacola.
     */
    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}
