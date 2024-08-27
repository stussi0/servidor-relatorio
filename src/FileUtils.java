import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileUtils {

    private static final String DATA_DIR = "data/";

    public static Map<String, String> parseJson(String json) {
        Map<String, String> data = new HashMap<>();
        json = json.replaceAll("[{}\"]", "");
        String[] pairs = json.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length > 1) {
                data.put(keyValue[0].trim(), keyValue[1].trim());
            }
        }
        return data;
    }

    public static void saveDataToFile(String fileName, Map<String, String> data) throws IOException {
        Path filePath = Paths.get(DATA_DIR + fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        }
    }

    public static List<String> getUserFiles(String user) throws IOException {
        List<String> userFiles = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(DATA_DIR), user + "_*.txt")) {
            for (Path entry : stream) {
                userFiles.add(Files.readString(entry));
            }
        }
        return userFiles;
    }
}
