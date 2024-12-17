package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

        //try (PrintStream ps = new PrintStream("C:\\Users\\stavp\\Desktop\\text.txt", StandardCharsets.UTF_8)){
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\stavp\\Desktop\\text.txt", true),
                true, StandardCharsets.UTF_8)){
            printMessage(ps, "Hello World!");
            printMessage(System.out, "Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic PrintStream method.
     *
     * @param ps
     * @param message
     */
    public static void printMessage (PrintStream ps, String message){
        ps.println(message);
    }
}
