package Animals;

public class BigDog extends Dog {

    public BigDog(String name){
        this.name = name;
        size = 10;
    }

    @Override
    public void makeNoise() {
        System.out.println("ГАВ-ГАВ");
    }

    @Override
    public void eat() {
        System.out.println("ХРУМ-ХРУМ");
    }

    @Override
    public void getDescription() {
        System.out.println("Это большая собака по имени " + name);
    }
}