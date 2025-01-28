package gr.aueb.cf.ch15.default_static;

public class Main {

    public static void main(String[] args) {
        IWelcome.staticMethod();
        CodingWelcome.staticMethod();

        CodingWelcome codingWelcome = new CodingWelcome();
        codingWelcome.defaultMethod();
    }
}
