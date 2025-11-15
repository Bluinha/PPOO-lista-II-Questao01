import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigManager {

    private static ConfigManager instance;
    private ConfigFile configFile;

    // Caminho do arquivo de configuração
    private static final String CONFIG_PATH = "config.ini";

    // Construtor privado (Singleton)
    private ConfigManager() {
        this.configFile = new ConfigFile();
        loadConfigFromFile();
    }

    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private void loadConfigFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(CONFIG_PATH))) {

            String line;
            while ((line = br.readLine()) != null) {

                // Ignora linhas vazias ou inválidas
                if (!line.contains("=")) continue;

                String[] parts = line.split("=", 2);
                String key = parts[0].trim();
                String value = parts.length > 1 ? parts[1].trim() : "";

                switch (key) {
                    case "AppId":
                        configFile.setAppId(Integer.parseInt(value));
                        break;
                    case "UserName":
                        configFile.setUserName(value);
                        break;
                    case "Language":
                        configFile.setLanguage(value);
                        break;
                    case "Offline":
                        configFile.setOffline(Integer.parseInt(value));
                        break;
                    case "AutoDLC":
                        configFile.setAutoDLC(Integer.parseInt(value));
                        break;
                    case "BuildId":
                        configFile.setBuildId(Integer.parseInt(value));
                        break;
                    case "DLCName":
                        configFile.setDlcName(value);
                        break;
                    case "UpdateDB":
                        configFile.setUpdateDB(Integer.parseInt(value));
                        break;
                    case "Signature":
                        configFile.setSignature(value);
                        break;
                    case "WindowInfo":
                        configFile.setWindowInfo(value);
                        break;
                    case "LVWindowInfo":
                        configFile.setLvWindowInfo(value);
                        break;
                    case "ApplicationPath":
                        configFile.setApplicationPath(value);
                        break;
                    case "WorkingDirectory":
                        configFile.setWorkingDirectory(value);
                        break;
                    case "WaitForExit":
                        configFile.setWaitForExit(Integer.parseInt(value));
                        break;
                    case "NoOperation":
                        configFile.setNoOperation(Integer.parseInt(value));
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de configuração: " + e.getMessage());
        }
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }
}
