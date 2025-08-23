package atividade1;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque instancia;
    private List<Produto> produtos;

    private Estoque() {
        produtos = new ArrayList<>();
    }

    public static Estoque getInstance() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
