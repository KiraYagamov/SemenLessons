package Lesson3;

public class Phone {

    public String model;
    public float weight;
    public String number;

    public Phone(String model, float weight, String number){
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public void call(String num){
        System.out.println(number + " звонит " + num);
    }
}