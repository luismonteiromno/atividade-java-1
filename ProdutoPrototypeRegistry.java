public class ProdutoPrototypeRegistry {
    private static final Camisa prototipoCamisa = new Camisa();
    private static final Tenis prototipoTenis = new Tenis();

    static {
        prototipoCamisa.setPreco(79.90);
        prototipoTenis.setPreco(199.90);
    }

    public static Produto getClone(String tipo) {
        switch (tipo) {
            case "Camisa":
                return prototipoCamisa.clone();
            case "Tênis":
                return prototipoTenis.clone();
            default:
                return null;
        }
    }
}
