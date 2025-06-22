import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light roomLight = new Light();

        Command lightOn = new LightOnCommand(roomLight);
        Command lightOff = new LightOffCommand(roomLight);

        RemoteControl remote = new RemoteControl();

        OUTER:
        do {
            System.out.println("Press 1 to turn light on\nPress 2 to turn light off\nPress 0 to exit:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    remote.setCommand(lightOn);
                    remote.pressButton();
                    System.out.println("---------------------------");
                }
                case 2 -> {
                    remote.setCommand(lightOff);
                    remote.pressButton();
                    System.out.println("---------------------------");
                }
                default -> {
                    break OUTER;
                }
            }
        } while (true);
    }
}