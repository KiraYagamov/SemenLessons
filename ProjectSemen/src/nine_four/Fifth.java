package nine_four;

public class Fifth implements Task{
    @Override
    public void doTask() {
        System.out.println("Вводите числа. Программа завершится числом 0!");
        int count = 0;
        int num = scanner.nextInt();
        while (num != 0){
            count++;
            num = scanner.nextInt();
        }
        System.out.println(count);
    }

    @Override
    public void getDescription() {
        System.out.println("Программа получает на вход последовательность целых неотрицательных чисел, \n" +
                "каждое число записано в отдельной строке. \n" +
                "Последовательность завершается числом 0, при считывании которого программа должна закончить\n" +
                "свою работу и вывести количество членов последовательности (не считая завершающего числа 0).\n" +
                "Числа, следующие за числом 0, считывать не нужно.");
    }
}
