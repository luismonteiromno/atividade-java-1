package atividade_2_seminario;

// ================== DECORATOR ==================
// O padrão Decorator permite adicionar funcionalidades extras a um objeto
// sem modificar sua estrutura original. Ele "envolve" o objeto base com camadas extras.

// Decorador base abstrato: implementa a interface InputReader, 
// mas delega a execução para outro InputReader (wrappedReader).
abstract class InputReaderDecorator implements InputReader {
    // O objeto original que será "decorado"
    protected InputReader wrappedReader;

    // Construtor recebe o objeto que será decorado
    public InputReaderDecorator(InputReader reader) {
        this.wrappedReader = reader;
    }

    // Método padrão: apenas chama o método do objeto "embrulhado"
    public String readInput() {
        return wrappedReader.readInput();
    }
}

// ================== DECORADOR CONCRETO 1 ==================
// Esse decorador transforma a entrada em MAIÚSCULAS.
// Exemplo: usuário digita "oi", o sistema recebe "OI".
class UpperCaseDecorator extends InputReaderDecorator {
    public UpperCaseDecorator(InputReader reader) {
        super(reader); // passa o objeto original para o decorador base
    }

    @Override
    public String readInput() {
        // Chama o método original e aplica transformação extra
        return super.readInput().toUpperCase();
    }
}

// ================== DECORADOR CONCRETO 2 ==================
// Esse decorador adiciona LOG a cada entrada.
// Exemplo: usuário digita "teste" → imprime no console "[LOG] Usuário digitou:
// teste"
class LoggingDecorator extends InputReaderDecorator {
    public LoggingDecorator(InputReader reader) {
        super(reader);
    }

    @Override
    public String readInput() {
        String input = super.readInput(); // lê normalmente
        System.out.println("[LOG] Usuário digitou: " + input); // adiciona o log
        return input; // retorna o mesmo valor lido
    }
}
