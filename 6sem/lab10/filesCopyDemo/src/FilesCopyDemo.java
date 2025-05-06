import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyDemo {
    public static void main(String[] args) {
        // Создаем базовые пути
        Path basePath = Paths.get("C:/JavaProgramming/gameData");
        Path scoresDir = Paths.get("scores");
        Path backupDir = Paths.get("backup");
        Path highscoresFile = Paths.get("Highscores.txt");

        // Формируем полные пути
        Path workingDir = basePath.resolve(scoresDir);          // Рабочая директория
        Path workingFile = workingDir.resolve(highscoresFile);  // Рабочий файл
        Path backupPath = basePath.resolve(backupDir);          // Директория для резервных копий
        Path backupFile = backupPath.resolve(highscoresFile);   // Файл резервной копии

        try {
            // Если рабочий файл существует
            if(Files.exists(workingFile)) {
                // Проверяем/создаем директорию для резервных копий
                if(Files.notExists(backupPath)) {
                    Files.createDirectories(backupPath);
                }
                // Копируем файл с заменой и сохранением атрибутов
                Files.copy(workingFile, backupFile,
                         StandardCopyOption.REPLACE_EXISTING,
                         StandardCopyOption.COPY_ATTRIBUTES);
            }

            // Проверяем/создаем рабочую директорию
            if(Files.notExists(workingDir)) {
                Files.createDirectories(workingDir);
            }

            // Проверяем/создаем рабочий файл
            if(Files.notExists(workingFile)) {
                Files.createFile(workingFile);
            }
        }
        catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e);
        }
    }
}