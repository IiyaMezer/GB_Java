import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HW1_task1 {
    public static LocalTime time = LocalTime.now();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        var timeFormat = DateTimeFormatter.ofPattern("HH:mm");


        if (timeInRange(LocalTime.of(5,00), LocalTime.of(11,59))){
            System.out.println("G morning,"+ name + '!');
        }
        else if (timeInRange(LocalTime.of(12,00), LocalTime.of(17,59))) {
            System.out.println("G day,"+ name + '!');
        }
        else if (timeInRange(LocalTime.of(18,00), LocalTime.of(22,59))) {
            System.out.println("G evening,"+ name + '!');
        }
        else if (timeInRange(LocalTime.of(23,00), LocalTime.of(4,59))) {
            System.out.println("G night,"+ name + '!');
        }
        in.close();

    }

    static boolean timeInRange(LocalTime leftLimit, LocalTime rightLimit){
        return time.isAfter(leftLimit) && time.isBefore(rightLimit);
    }
}
