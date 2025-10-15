package padrao_strategy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Classe principal para testar o padrão Strategy.
 * 
 * Permite ao usuário escolher o algoritmo de ordenação em tempo de execução.
 */
public class Main {
    public static void main(String[] args) {
        // Array de exemplo
        int[] numeros = { 64, 25, 12, 22, 11 };

        // Cria o contexto
        SortContext context = new SortContext();

        try (// Interface simples via terminal
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Quick Sort");
            System.out.println("3 - Merge Sort");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            // Define a estratégia com base na escolha do usuário
            switch (opcao) {
                case 1 -> context.setStrategy(new BubbleSort());
                case 2 -> context.setStrategy(new QuickSort());
                case 3 -> context.setStrategy(new MergeSort());
                default -> {
                    System.out.println("Opção inválida!");
                    return;
                }
            }
        }
        // Mostra o array antes da ordenação
        System.out.println("Array antes: " + Arrays.toString(numeros));

        // Aplica a ordenação (chama o método da estratégia selecionada)
        context.sortArray(numeros);

        // Mostra o resultado final
        System.out.println("Array depois: " + Arrays.toString(numeros));
    }
}
