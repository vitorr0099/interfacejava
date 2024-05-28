package br.univille.log;

public class Main {
    public static void main(String[] args) {
        // Criação de loggers usando a LoggerFactory
        Logger consoleLogger = LoggerFactory.onConsole();
        Logger fileLogger = LoggerFactory.onFile();

        // Exemplos de logs no console
        consoleLogger.log(Level.DEBUG, "This is a debug message.");
        consoleLogger.log(Level.WARNING, "This is a warning message.");
        consoleLogger.log(Level.ERROR, "This is an error message.");

        // Exemplos de logs em arquivo
        fileLogger.log(Level.DEBUG, "This is a debug message written to the file.");
        fileLogger.log(Level.WARNING, "This is a warning message written to the file.");
        fileLogger.log(Level.ERROR, "This is an error message written to the file.");
    }
}