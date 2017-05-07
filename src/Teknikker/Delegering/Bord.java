package Teknikker.Delegering;

import java.util.ArrayList;

/**
 * Implementer Iterable.
 * Bruk delegering.
 */
public class Bord{

    private ArrayList<Person> sittendeGjester = new ArrayList<>();

    public Bord(ArrayList<Person> sittendeGjester) {
        this.sittendeGjester = sittendeGjester;
    }

    public void fjernGjester(){
        sittendeGjester = new ArrayList<>();
    }

    //Dette er også delegering.
    public void addGjest(String name){
        sittendeGjester.add(new Person(name));
    }



}
