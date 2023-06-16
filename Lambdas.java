class Lambdas {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        // myCat.print();
        printThing(() -> {
            System.out.println("Meow");
        });
        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}