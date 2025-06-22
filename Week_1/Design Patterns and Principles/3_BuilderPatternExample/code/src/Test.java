import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter details of computer 1:");
            System.out.print("CPU: ");
            String cpu1 = sc.nextLine();
            System.out.print("RAM: ");
            String ram1 = sc.nextLine();
            Computer comp1 = new Computer.Builder(cpu1,ram1).build();
            
            System.out.println("Enter details of computer 2:");
            System.out.print("CPU: ");
            String cpu2 = sc.nextLine();
            System.out.print("RAM: ");
            String ram2 = sc.nextLine();
            System.out.print("Storage: ");
            String storage = sc.nextLine();
            System.out.print("GPU: ");
            String gpu = sc.nextLine();
            System.out.print("OS: ");
            String os = sc.nextLine();
            Computer comp2 = new Computer.Builder(cpu2,ram2)
                    .setStorage(storage)
                    .setGpu(gpu)
                    .setOs(os)
                    .build();
            
            comp1.getComputer();
            comp2.getComputer();
        }
    }
}