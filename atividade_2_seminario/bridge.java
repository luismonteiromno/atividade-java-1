package atividade_2_seminario;

// ================== COMANDO CONCRETO (Bridge) ==================
// Classe que representa um "comando concreto" dentro do padrão **Command**.

class ConcreteCommand implements Command {
    // Referência para o "executor" responsável por realmente realizar a ação
    private CommandExecutor executor;

    // Ação a ser executada (pode ser, por exemplo, uma string que representa o
    // comando)
    private String action;

    // Construtor que recebe o executor e a ação específica.
    // Isso permite criar comandos diferentes sem mudar a lógica da classe.
    public ConcreteCommand(CommandExecutor executor, String action) {
        this.executor = executor;
        this.action = action;
    }

    // Método da interface Command que deve ser implementado.
    // Quando o comando é executado, ele delega a execução para o "executor".
    @Override
    public void execute() {
        executor.run(action);
    }
}
