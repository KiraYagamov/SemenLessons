package Cars;

public abstract class Car {
    Driver driver;
    Engine engine;
    String mark;
    String model;

    public void drive(){
        if(driver != null){
            System.out.println(driver.name + " ведет автомобиль " + mark + " " + model);
        }
        else{
            System.out.println("У автомобиля " + mark + " " + model + " нет водителя!");
        }
    }

    public void getCarData(){
        System.out.println("Мощность двигателя: " + engine.power);
        System.out.println("Марка: " + mark);
        System.out.println("Модель: " + model);
    }
    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void setDriver(String name, int experience){
        this.driver = new Driver(name, experience);
    }

    public Driver getDriver(){
        return driver;
    }
}