package gr.aueb.cf.ch16.callbacks;

public class Main3 {

    public static void main(String[] args) {

        doPrint(() -> sayHelloWorld());

        doPrint(() -> sayHelloCoding());

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }

    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void sayHelloCoding() {
        System.out.println("Hello Coding");
    }
}
