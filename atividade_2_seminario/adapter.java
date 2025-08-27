package atividade_2_seminario;

import java.util.Scanner;

// ================== ADAPTER ==================
// Padrão de projeto **Adapter**.
// O objetivo do Adapter é "adaptar" a interface de uma classe existente 
// para outra interface esperada pelo sistema, sem precisar alterar o código original.

// Interface que define o formato esperado para entrada de texto no sistema
interface InputReader {
    String readInput();
}

// Classe Adapter que converte o uso do Scanner (classe do Java)
// para a interface InputReader, que o nosso sistema espera.
class ScannerAdapter implements InputReader {
    private Scanner scanner; // Referência para o Scanner original do Java

    // Construtor que recebe um objeto Scanner já criado
    public ScannerAdapter(Scanner scanner) {
        this.scanner = scanner;
    }

    // Implementação do método da interface InputReader.
    // Internamente, ele apenas chama o método 'nextLine()' do Scanner.
    // Ou seja, o Adapter traduz o "contrato" do Scanner para o formato esperado
    // (InputReader).
    @Override
    public String readInput() {
        return scanner.nextLine();
    }
}
