package atividade3.produto;

import java.util.HashMap;
import java.util.Map;

/**
 * Fábrica Flyweight responsável por gerenciar objetos Produto.
 * Garante que produtos com o mesmo nome não sejam recriados na memória.
 */
public class ProdutoFactory {
    private static final Map<String, Produto> produtos = new HashMap<>();

    /**
     * Retorna um Produto existente ou cria um novo caso não exista.
     * 
     * @param nome  Nome do produto.
     * @param preco Preço do produto.
     * @return Instância única do Produto.
     */
    public static Produto getProduto(String nome, double preco) {
        if (!produtos.containsKey(nome)) {
            produtos.put(nome, new Produto(nome, preco));
        }
        return produtos.get(nome);
    }
}
