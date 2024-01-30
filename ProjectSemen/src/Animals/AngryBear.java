package Animals;

public class AngryBear extends Bear {
    public AngryBear(String name){
        this.name = name;
        kindness = 0;
    }

    @Override
    public void makeNoise() {
        System.out.println("РРРРРРРРР");
    }

    @Override
    public void eat() {
        System.out.println("Ест кого-то...");
    }

    @Override
    public void getDescription() {
        System.out.println("Это агрессивный медведь по имени " + name);
    }
}
