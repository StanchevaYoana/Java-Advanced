package GenericBoxOfInteger;

public class Box<E> {

    private E element;

    public Box (E element){
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}
