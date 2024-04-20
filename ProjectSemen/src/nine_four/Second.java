package nine_four;

public class Second implements Task{
    public void doTask(){
        System.out.println("Введите число для задачи!");
        double number = scanner.nextDouble();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0){
                System.out.println(i);
                break;
            }
        }
    }

    @Override
    public void getDescription() {
        System.out.println("Программа выводит наименьший целый делитель больше 1 для заданного числа!");
    }
}