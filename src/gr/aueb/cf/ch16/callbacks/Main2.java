package gr.aueb.cf.ch16.callbacks;

public class Main2 {

    public static void main(String[] args) {

        doPrint(() -> System.out.println("Hello World"));

        doPrint(() -> System.out.println("Hello Coding"));

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }
}