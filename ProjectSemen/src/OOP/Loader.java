package OOP;

public class Loader {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Shape();
        shapes[3] = new Circle();

        for (Shape shape : shapes) {
            shape.rotate();
        }
    }
    public void dasd(Shape s){
        s.rotate();
    }
}
