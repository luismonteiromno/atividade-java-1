package aula4;

// ================== INTERFACE BASE DE COMANDO (Abstração - Bridge) ==================
// A interface Command define a operação que todos os comandos devem implementar.
// Ela representa a "abstração" no padrão Bridge.
interface Command {
    void execute();
}

// ================== IMPLEMENTAÇÃO DE COMANDOS (Implementor - Bridge)
// ==================
// O Bridge separa a "abstração" (Command) da "implementação" (CommandExecutor).
// Aqui definimos a interface para o "executor" de comandos.
interface CommandExecutor {
    void run(String action);
}

// ================== IMPLEMENTAÇÃO CONCRETA DO EXECUTOR ==================
// Classe para executar a ação.
// É o lado "Implementor concreto" do padrão Bridge.
class ConcreteCommandExecutor implements CommandExecutor {
    @Override
    public void run(String action) {
        System.out.println("Executando ação: " + action);
    }
}
