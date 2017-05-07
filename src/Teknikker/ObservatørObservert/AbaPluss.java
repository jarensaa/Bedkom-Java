package Teknikker.ObservatørObservert;

import java.util.ArrayList;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public class AbaPluss implements Interessegruppe {

    ArrayList<Interessegruppelistener> observatører = new ArrayList<>();


    public String getInfo(){
        return "Abapluss er interessegruppen for abakuler med interesse for finans. " +
                "Vår visjon er å skape et levende og etablert finansmiljø innad i Abakus. " +
                "Interessegruppen har et fokus på felles læring og personlig vekst.";
    }
}
