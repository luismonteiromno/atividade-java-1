public abstract class ProdutoFactory {
    public abstract Produto criarProduto();
}

class CamisaFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto() {
        return new Camisa();
    }
}

class TenisFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto() {
        return new Tenis();
    }
}
