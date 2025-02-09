package gr.aueb.cf.ch18;

public class Main {

    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem(); // compile time error
        // because a string cannot be typecast in an int
        System.out.println(item);
    }
}