import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race=new Race();
        Car[] cars=new Car[3];

        for (int i = 0; i < 3; i++) {
            enterNameString(i+1, "название");
            String carName = scanner.next();
            enterNameString(i+1, "скорость");
            int carSpeed  = speedChecking();
            while(!(carSpeed > 0 && carSpeed <= 250)) {
                System.out.println("Неправильная скорость");
                enterNameString(i+1, "скорость");
                carSpeed  = speedChecking();
            }

            cars[i]=new Car(carName, carSpeed);

        }
        race.bestCar(cars);
    }

    public static int speedChecking() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

public static void enterNameString(int i, String s) {
    System.out.println("Введите "+ s+" машины №"+i);
}
}

