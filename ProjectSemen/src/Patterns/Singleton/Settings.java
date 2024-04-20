package Patterns.Singleton;

public class Settings {
    public static Settings mainSettings;

    public float volume;
    public float brightness;
    public boolean torch;

    public Settings(){
        mainSettings = this;
    }

    public void setVolume(float volume){
        this.volume = volume;
    }
    public void setBrightness(float brightness){
        this.brightness = brightness;
    }
    public void setTorch(boolean torch){
        this.torch = torch;
    }
}
