package creational.singleton;

public class Config {
    private static Config instance;
    private String appName;

    private Config() {
        appName = "My Application";
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }
}
