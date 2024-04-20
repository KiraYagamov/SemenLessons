package nine_four;

public class Fourth implements Task{
    @Override
    public void doTask() {
        System.out.println("Введите число для задачи!");
        double number = scanner.nextDouble();
        System.out.println("Введите второе число!");
        int y = scanner.nextInt();
        int day = 1;
        while (number < y) {
            number *= 1.1;
            day++;
        }
        System.out.println(day);
    }

    @Override
    public void getDescription() {
        System.out.println("В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.");
    }
}
