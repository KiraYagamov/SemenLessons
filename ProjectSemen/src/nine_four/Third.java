package nine_four;

public class Third implements Task {
    @Override
    public void doTask() {
        System.out.println("Введите число для задачи!");
        double number = scanner.nextDouble();
        int step = 0;
        for (int i = 1; Math.pow(2, i) <= number; i++) {
            step = i;
        }
        System.out.println("Число: " + Math.pow(2, step) + " Степень: " + step);
    }

    @Override
    public void getDescription() {
        System.out.println("Программа выводит максимальную степень двойки до заданного числа!");
    }
}
