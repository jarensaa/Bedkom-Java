package Teknikker.ObservatørObservert;

import java.util.ArrayList;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public class AbaKule implements Interessegruppelistener{

    ArrayList<Interessegruppe> observerte = new ArrayList<>();
    private String name;

    public AbaKule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
