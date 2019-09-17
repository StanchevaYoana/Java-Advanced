package Threeuple;

public class Threeuple<Item1, Item2, Item3> {

    private Item1 item1;
    private Item2 item2;
    private Item3 item3;


    public Threeuple(Item1 item1, Item2 item2, Item3 item3) {

        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }


    @Override
    public String toString() {
        return this.item1 + " -> " + this.item2 + " -> " + this.item3;
    }
}
