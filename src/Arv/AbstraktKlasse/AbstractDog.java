package Arv.AbstraktKlasse;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public abstract class AbstractDog {

    private String name;
    private String race;
    private float weight;

    public AbstractDog(String name, String race, float weight){
        this.name = name;
        this.race = race;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getRace() {
        return race;
    }


    //Print out a full description of the Dog.
    public abstract String toString();

    //Bark at the other dog. Print relevant info.
    public abstract void bark(AbstractDog dog);
}
