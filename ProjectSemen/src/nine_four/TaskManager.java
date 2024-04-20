package nine_four;

import java.util.Scanner;

public class TaskManager {
    Task[] tasks = {new First(), new Second(), new Third(), new Fourth(), new Fifth(), new Sixth()};
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.selectTask();
    }
    public void selectTask(){
        System.out.println("Выберите задачу: ");
        try{
            int number = scanner.nextInt();
            if (number == 0) return;
            Task task = tasks[number-1];
            task.getDescription();
            tasks[number-1].doTask();
            selectTask();
        }
        catch (Exception e){
            System.out.println("Введите число!");
        }
    }
}
