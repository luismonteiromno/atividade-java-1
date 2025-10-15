package padrao_strategy;

/**
 * Implementação da estratégia de ordenação usando o algoritmo Bubble Sort.
 * 
 * É uma das classes concretas do padrão Strategy.
 */
public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Usando Bubble Sort...");
        int n = array.length;

        // Percorre o vetor repetidamente, trocando elementos adjacentes
        // se estiverem fora de ordem.
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
