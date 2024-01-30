package Cars;

public class BMW extends Car {
    public BMW(){
        engine = new BMW_X1();
        this.driver = null;
        mark = "BMW";
        model = "X1";
    }

    public BMW(Driver driver){
        engine = new BMW_X1();
        this.driver = driver;
        mark = "BMW";
        model = "X1";
    }
}