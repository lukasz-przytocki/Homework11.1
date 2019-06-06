import java.util.Scanner;

public class Data {

    static void inputData(UniqueArray[] array, int i) {
        Scanner scanner = new Scanner(System.in);
        array[i] = new UniqueArray();
        System.out.printf("Enter %d name: ", i + 1);
        array[i].setName(scanner.nextLine());
        System.out.printf("Enter %d age: ", i + 1);
        array[i].setAge(scanner.nextInt());
        scanner.nextLine();
    }
}
