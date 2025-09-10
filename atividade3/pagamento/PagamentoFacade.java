package atividade3.pagamento;

/**
 * Classe Facade que simplifica o processo de pagamento.
 * Encapsula a lógica dos diferentes métodos de pagamento.
 */
public class PagamentoFacade {

    /**
     * Realiza o pagamento de acordo com o método informado.
     * 
     * @param metodo Método de pagamento (ex: "cartao", "boleto").
     * @param valor  Valor a ser pago.
     */
    public void pagar(String metodo, double valor) {
        switch (metodo.toLowerCase()) {
            case "cartao":
                System.out.println("Pagamento de R$" + valor + " via Cartão.");
                break;
            case "boleto":
                System.out.println("Pagamento de R$" + valor + " via Boleto.");
                break;
            default:
                System.out.println("Método de pagamento não suportado.");
        }
    }
}
