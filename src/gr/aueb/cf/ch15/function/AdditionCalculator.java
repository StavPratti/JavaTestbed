package gr.aueb.cf.ch15.function;

public class AdditionCalculator implements ICalculator {

    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
