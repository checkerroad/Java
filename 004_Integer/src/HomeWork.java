// Создать новый класс, в котором вы вводите количество секунд, а программа выводит
// в консоль, сколько это дней, часов, минут и секунд //
public class HomeWork {
    public static void main(String[] args) {
        int seconds = 1000000;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;
        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;
        System.out.println("Общее количество секунд: " + seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд:" + leftSeconds);
    }
}
