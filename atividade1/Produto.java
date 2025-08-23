package atividade1;

public abstract class Produto implements Cloneable {
    protected String nome;
    protected double preco;

    public abstract void exibirInfo();

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Produto clone() {
        try {
            return (Produto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Camisa extends Produto {
    public Camisa() {
        this.nome = "Camisa";
    }

    @Override
    public void exibirInfo() {
        System.out.println(nome + " - R$" + preco);
    }
}

class Tenis extends Produto {
    public Tenis() {
        this.nome = "Tênis";
    }

    @Override
    public void exibirInfo() {
        System.out.println(nome + " - R$" + preco);
    }
}
