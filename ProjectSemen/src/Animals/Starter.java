package Animals;

import java.util.ArrayList;

public class Starter {

    String[] names = {"Вася", "Рич", "Кот", "Шарик", "Дружок", "Мальчик", "Данил"};

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.start();
    }

    public void start(){
        ArrayList<Animal2> animals = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            animals.add(getAnimal());
        }

        for (Animal2 animal: animals) {
            animal.getDescription();
        }
    }

    public Animal2 getAnimal(){
        int nameIndex = (int) (Math.random() * names.length);
        String name = names[nameIndex];
        int animalIndex = (int) (Math.random() * 6);

        switch (animalIndex){
            case 0: return new BigDog(name);
            case 1: return new SmallDog(name);
            case 2: return new FluffyCat(name);
            case 3: return new SleekCat(name);
            case 4: return new AngryBear(name);
            case 5: return new KindBear(name);
            default: return null;
        }
    }
}
