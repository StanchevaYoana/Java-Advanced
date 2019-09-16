package GenericBox;

public class Box <T>{
   private T element;

  public void setElement(T input){
        this.element = input;
    }

    @Override
    public String toString() {
        return String.format("java.lang.String: %s",element );
    }
}
