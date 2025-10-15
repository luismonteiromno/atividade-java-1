package padrao_strategy;

/**
 * Implementação da estratégia de ordenação usando o algoritmo Quick Sort.
 * 
 * Também faz parte das classes concretas do padrão Strategy.
 */
public class QuickSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Usando Quick Sort...");
        quickSort(array, 0, array.length - 1);
    }

    // Função recursiva que divide o array e aplica o particionamento
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);

            // Ordena as duas metades recursivamente
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    // Particiona o array e retorna o índice do pivô
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Troca os elementos
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Coloca o pivô na posição correta
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
