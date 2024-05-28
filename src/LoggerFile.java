package br.univille.log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LoggerFile implements Logger {
    private static final String FILE_PATH = "log.txt";

    @Override
    public void log(Level level, String message) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            writer.write(timeStamp + " [" + level + "] " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}