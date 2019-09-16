package GenericCountMethodStrings;

public class Box <T extends  Comparable<T>> {
    T element;

    public Box(T element){
        this.element = element;
    }

}
