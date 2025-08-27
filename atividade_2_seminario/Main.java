package atividade_2_seminario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ================== ADAPTER ==================
        // Utiliza o ScannerAdapter para "adaptar" o Scanner do Java
        // para o formato da nossa interface InputReader.
        InputReader inputReader = new ScannerAdapter(scanner);

        // ================== DECORATORS ==================
        // Encapsula o inputReader em dois decoradores:
        // 1. UpperCaseDecorator → transforma toda entrada em maiúsculas.
        // 2. LoggingDecorator → imprime no console o que foi digitado.
        // A ordem importa: primeiro converte em maiúsculas, depois loga.
        inputReader = new LoggingDecorator(new UpperCaseDecorator(inputReader));

        // ================== BRIDGE ==================
        // Cria o executor concreto, que sabe como rodar os comandos.
        CommandExecutor executor = new ConcreteCommandExecutor();

        System.out.println("Digite um comando (sair para encerrar):");

        while (true) {
            // Lê entrada do usuário, já passando pelo Adapter + Decorators
            String input = inputReader.readInput();

            // Ao digitar "SAIR", encerra o loop
            if (input.equalsIgnoreCase("SAIR")) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            // ================== COMMAND ==================
            // Criamos um comando concreto que encapsula a ação digitada.
            // Esse comando delega sua execução ao executor (Bridge).
            Command command = new ConcreteCommand(executor, input);

            // Executa o comando
            command.execute();
        }

        scanner.close();
    }
}
