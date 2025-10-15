package padrao_strategy;

/**
 * Interface que define o contrato para as estratégias de ordenação.
 * 
 * Faz parte do Padrão Strategy:
 * Todas as classes concretas (BubbleSort, QuickSort, MergeSort)
 * devem implementar este método da mesma forma (sort),
 * mas com comportamentos diferentes.
 */
public interface SortStrategy {

    /**
     * Método comum que todas as estratégias devem implementar.
     * Cada classe concreta aplicará seu próprio algoritmo de ordenação.
     */
    void sort(int[] array);
}
