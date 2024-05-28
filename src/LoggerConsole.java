package br.univille.log;

class LoggerConsole implements Logger {
    @Override
    public void log(Level level, String message) {
        String color;
        switch (level) {
            case DEBUG:
                color = "\u001B[32m"; // Verde
                break;
            case WARNING:
                color = "\u001B[33m"; // Amarelo
                break;
            case ERROR:
                color = "\u001B[31m"; // Vermelho
                break;
            default:
                color = "\u001B[0m"; // Reset
        }
        System.out.println(color + message + "\u001B[0m");
    }
}