package Lesson4;

public class Human {
    private int age;

    public Human(int age){
        if(age >= 0) this.age = age;
        else this.age = 0;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if(age >= 0) this.age = age;
        else try {
            throw new AgeException();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
