package GenericBox;

public class Box <T>{
   private T element;

  public Box(T input){
        this.element = input;
    }

    @Override
    public String toString() {
        return this.element.getClass().getName() + ": " + this.element;
    }
}
