package Animals;

public class SleekCat extends Cat {
    public SleekCat(String name){
        this.name = name;
        smoothness = 10;
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
        System.out.println("Это гладкая кошка по имени " + name);
    }
}
