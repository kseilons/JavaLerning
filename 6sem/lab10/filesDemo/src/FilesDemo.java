import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Path dirPath = Paths.get("C:/JavaProgramming/gameData");
        Path usersFilePath = Paths.get("Highscores.txt");
        Path settingsFilePath = Paths.get("Settings.txt");

        Path users, settings;

        users = checkFiles(dirPath, usersFilePath);
        settings = checkFiles(dirPath, settingsFilePath);

        if (users != null) {
            displayFileStatus(users, settings);
        }

        // Удаление settings.txt
        deleteFile(settings);

        // Удаление директории (если пустая)
        deleteFile(dirPath);
    }

    static Path checkFiles(Path dirPath, Path filePath) {
        Path absPath = dirPath.resolve(filePath);
        try {
            if (Files.notExists(dirPath)) {
                Files.createDirectories(dirPath);
            }
            if (Files.notExists(absPath)) {
                Files.createFile(absPath);
            }
        } catch (IOException x) {
            System.err.println(x);
            return null;
        }
        return absPath;
    }

    static void displayFileStatus(Path users, Path settings) throws IOException {
        System.out.println("Readable   : " + Files.isReadable(users));
        System.out.println("Writeable  : " + Files.isWritable(users));
        System.out.println("Executable : " + Files.isExecutable(users));
        System.out.println("Hidden     : " + Files.isHidden(users));
        System.out.println("Same files : " + Files.isSameFile(users, settings));
    }

    static void deleteFile(Path filePath) {
        // Удаляет файл/директорию, если она существует
        try {
            if (Files.exists(filePath)) {
                Files.delete(filePath);
                System.out.println(filePath.toString() + " deleted!");
            } else {
                System.out.println(filePath.toString() + " not found!");
            }
        } catch (DirectoryNotEmptyException e) {
            System.err.println("The directory is not empty: " + filePath);
        } catch (IOException x) {
            System.err.println("Error deleting " + filePath + ": " + x.getMessage());
        }
    }
}
