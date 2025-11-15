public class ConfigManager {

    private static ConfigManager instance;
    private ConfigFile configFile;


    private ConfigManager() {

    }

    // Método de acesso à instância
    public static synchronized ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
