import atividade3.produto.ProdutoFactory;
import atividade3.sacola.Sacola;
import atividade3.pagamento.PagamentoFacade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sacola> sacolas = new ArrayList<>();
        PagamentoFacade pagamento = new PagamentoFacade();

        // Usuário 1
        Sacola sacola1 = new Sacola();
        sacola1.adicionarProduto(ProdutoFactory.getProduto("Notebook", 3500));
        sacola1.adicionarProduto(ProdutoFactory.getProduto("Mouse", 150));
        sacolas.add(sacola1);

        // Usuário 2
        Sacola sacola2 = new Sacola();
        sacola2.adicionarProduto(ProdutoFactory.getProduto("Notebook", 3500)); // mesmo objeto Flyweight
        sacola2.adicionarProduto(ProdutoFactory.getProduto("Teclado", 200));
        sacolas.add(sacola2);

        // Pagamentos
        for (Sacola s : sacolas) {
            double total = s.calcularTotal();
            pagamento.pagar("cartao", total);
        }
    }
}
