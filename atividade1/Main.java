package atividade1;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = Estoque.getInstance();

        // Criando com Factory
        ProdutoFactory factory = new CamisaFactory();
        Produto camisa1 = factory.criarProduto();
        camisa1.setPreco(89.90);
        estoque.adicionarProduto(camisa1);

        // Criando com Prototype
        Produto tenis1 = ProdutoPrototypeRegistry.getClone("Tênis");
        estoque.adicionarProduto(tenis1);

        // Exibindo os produtos do estoque
        for (Produto p : estoque.getProdutos()) {
            p.exibirInfo();
        }
    }
}
