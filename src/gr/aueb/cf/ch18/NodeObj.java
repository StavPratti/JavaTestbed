package gr.aueb.cf.ch18;

public class  NodeObj {
    private Object item; // runtime errors
    // given as field an object class is not a good practice
    // instead we use generics

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
