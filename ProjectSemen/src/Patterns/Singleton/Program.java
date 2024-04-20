package Patterns.Singleton;

public class Program {
    public static void main(String[] args) {
        Settings settings = new Settings();
        settings.setVolume(5);
        settings.setBrightness(10);
        settings.setTorch(false);
        Program1 program1 = new Program1();
        program1.doSomething();
    }
}
