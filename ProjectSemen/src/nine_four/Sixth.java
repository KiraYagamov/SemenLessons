package nine_four;

public class Sixth implements Task{
    @Override
    public void doTask() {
        System.out.println("Введите число для задачи!");
        double number = scanner.nextDouble();
        System.out.println(getFibonacci(number));
    }

    @Override
    public void getDescription() {
        System.out.println("Последовательность Фибоначчи определяется так:\n" +
                "φ0 = 0,  φ1 = 1,  φn = φn−1 + φn−2.\n" +
                "\n" +
                "По данному числу n определите n-е число Фибоначчи φn.");
    }
    public double getFibonacci(double num){
        if (num <= 0) return 0;
        if (num == 1) return 1;
        else return getFibonacci(num-1) + getFibonacci(num-2);
    }
}
