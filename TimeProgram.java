
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeProgram {

    private int hour;
    private int minute;
    private int second;

    public TimeProgram() {
    }

    public TimeProgram(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        LocalTime time = LocalTime.of(hour, minute, second);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter second: ");
        int second = scanner.nextInt();

        TimeProgram time = new TimeProgram(hour, minute, second);
        System.out.println("Time is: " + time);
        scanner.close();
    }
}
