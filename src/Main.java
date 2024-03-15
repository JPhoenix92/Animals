import animal.Dog;

import java.util.Scanner;

public class Main {
    public static void
    main(String[] args) {
        Dog myDog = new Dog("Jessie");

        myDog.speak();

        Dog.fetch();

        Scanner scanner = new Scanner(System.in);
        String name = "jessie";
        System.out.print("Enter how many treats you want for your dog " +  name);
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        scanner.close();

    }
}