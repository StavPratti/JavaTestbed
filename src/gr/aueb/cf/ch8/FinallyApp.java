package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    /**
     *Two exceptions (one in try and
     * other in finally block) are not sufficient
     * plus the last exception is being propagated.
     * We want to draw our attention to
     * InputMismatchException.
     * Thus, we can simplify the finally block
     * by using scanner into try with parenthesis.
     * That's called try with resources.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert a num");
            num = in.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
