package animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");

    }
        public static void fetch() {
            System.out.println("Dog is fetching.");


        }
    }
