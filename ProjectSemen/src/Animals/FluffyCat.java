package Animals;

public class FluffyCat extends Cat {
    public FluffyCat(String name){
        this.name = name;
        smoothness = 2;
    }
    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println("Ням-ням");
    }

    @Override
    public void getDescription() {
        System.out.println("Это пушистая кошка по имени " + name);
    }
}
