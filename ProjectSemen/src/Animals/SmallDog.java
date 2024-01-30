package Animals;

public class SmallDog extends Dog {

    public SmallDog(String name){
        this.name = name;
        size = 2;
    }

    @Override
    public void makeNoise() {
        System.out.println("вуф-вуф");
    }

    @Override
    public void eat() {
        System.out.println("ням-ням");
    }

    @Override
    public void getDescription() {
        System.out.println("Это маленькая собака по имени " + name);
    }
}
