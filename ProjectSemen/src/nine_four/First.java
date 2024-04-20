package nine_four;

public class First implements Task{
    public void doTask(){
        System.out.println("Введите число для задачи!");
        double number = scanner.nextDouble();
        for (double i = 1; i * i <= number; i++) {
            System.out.println(i * i);
        }
    }

    @Override
    public void getDescription() {
        System.out.println("Программа выводит квадраты натуральных чисел до введенного числа!");
    }
}