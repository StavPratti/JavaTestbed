package gr.aueb.cf.ch15.skeletal2;

// With that order
public class Square extends AbstractRectangle implements ISquare {

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}