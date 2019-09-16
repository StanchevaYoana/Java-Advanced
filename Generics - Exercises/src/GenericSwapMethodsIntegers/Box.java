package GenericSwapMethodsIntegers;

public class Box<E> {
    E element;

    public Box(E element) {
        this.element = element;
    }


    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}
