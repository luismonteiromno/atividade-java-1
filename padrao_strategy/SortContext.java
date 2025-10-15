package padrao_strategy;

/**
 * Classe de contexto do padrão Strategy.
 * 
 * O SortContext mantém uma referência para um objeto do tipo SortStrategy,
 * permitindo mudar o algoritmo de ordenação em tempo de execução.
 */
public class SortContext {

    // Referência para a estratégia escolhida
    private SortStrategy strategy;

    /**
     * Define qual estratégia será usada.
     * 
     * Exemplo: context.setStrategy(new BubbleSort());
     */
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Executa o método sort() da estratégia definida.
     */
    public void sortArray(int[] array) {
        if (strategy == null) {
            System.out.println("Nenhuma estratégia definida!");
            return;
        }
        strategy.sort(array); // Chama o método sort() da estratégia selecionada
    }
}
