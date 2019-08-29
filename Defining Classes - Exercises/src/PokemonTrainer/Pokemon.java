package PokemonTrainer;

public class Pokemon {
//    name, an element and health, all values are mandatory. Every Trainer starts with 0 badges

    private String element;
    private int health;


    public Pokemon (String element, int health){

        this.element = element;
        this.health = health;
    }


    public void decreaseHealth() {
        this.health -= 10;
    }

    public String getElement() {
        return element;
    }

    public int getHealth (){
        return  this.health;
    }
}
