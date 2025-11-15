public class Main {
    public static void main(String[] args) {

        // Acessa a configuração carregada pelo Singleton
        ConfigManager cfg = ConfigManager.getInstance();
        ConfigFile c = cfg.getConfigFile();

        System.out.println("=== CONFIGURAÇÕES DO JOGO ===");
        System.out.println("AppId: " + c.getAppId());
        System.out.println("UserName: " + c.getUserName());
        System.out.println("Language: " + c.getLanguage());
        System.out.println("Offline: " + c.getOffline());
        System.out.println("AutoDLC: " + c.getAutoDLC());
        System.out.println("BuildId: " + c.getBuildId());
        System.out.println("DLCName: " + c.getDlcName());
        System.out.println("UpdateDB: " + c.getUpdateDB());
        System.out.println("Signature: " + c.getSignature());
        System.out.println("WindowInfo: " + c.getWindowInfo());
        System.out.println("LVWindowInfo: " + c.getLvWindowInfo());
        System.out.println("ApplicationPath: " + c.getApplicationPath());
        System.out.println("WorkingDirectory: " + c.getWorkingDirectory());
        System.out.println("WaitForExit: " + c.getWaitForExit());
        System.out.println("NoOperation: " + c.getNoOperation());
    }
}
