package atividade3.produto;

/**
 * Classe que representa um Produto no sistema.
 * Esta classe é usada como objeto Flyweight,
 * pois produtos iguais são compartilhados em memória.
 */
public class Produto {
    private final String nome;
    private final double preco;

    /**
     * Construtor do Produto.
     * 
     * @param nome  Nome do produto.
     * @param preco Preço do produto.
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return Nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Preço do produto.
     */
    public double getPreco() {
        return preco;
    }
}
