package Lesson4;

public class AgeException extends Exception {
    @Override
    public String getMessage() {
        return "Возраст не подходит!";
    }
}
