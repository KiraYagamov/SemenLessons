package Animals;

public class KindBear extends Bear {
    public KindBear(String name){
        this.name = name;
        kindness = 1000;
    }

    @Override
    public void makeNoise() {
        System.out.println("хрррр... хррррр...");
    }

    @Override
    public void eat() {
        System.out.println("Ест мед");
    }

    @Override
    public void getDescription() {
        System.out.println("Это добрый медведь по имени " + name);
    }
}
