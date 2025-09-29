package creational.singleton;

public class MainSingletonDemo {
    public static void main(String[] args) {
        Config config1 = Config.getInstance();
        Config config2 = Config.getInstance();

        System.out.println(config1.getAppName());
        System.out.println(config1 == config2); // true
    }
}
