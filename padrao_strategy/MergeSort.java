package padrao_strategy;

/**
 * Implementação da estratégia de ordenação usando o algoritmo Merge Sort.
 * 
 * Outra classe concreta que segue o contrato definido por SortStrategy.
 */
public class MergeSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("Usando Merge Sort...");
        mergeSort(array, 0, array.length - 1);
    }

    // Método recursivo que divide o array em duas metades
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Divide em duas metades
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Junta as metades ordenadas
            merge(array, left, middle, right);
        }
    }

    // Junta duas sublistas ordenadas
    private void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os elementos para arrays temporários
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Junta os dois subarrays comparando os elementos
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        // Copia o restante de cada metade
        while (i < n1)
            array[k++] = L[i++];
        while (j < n2)
            array[k++] = R[j++];
    }
}
