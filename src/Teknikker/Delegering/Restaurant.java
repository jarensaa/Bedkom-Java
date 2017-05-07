package Teknikker.Delegering;

import java.util.ArrayList;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public class Restaurant {

    ArrayList<Bord> bordene;

    /*
    Uncomment koden når iterable er implementert i bord.

    public void printNamesOfGuests(){
        for (Bord bord: bordene){
            for(Person person: bord){
                System.out.println(person.toString());
            }
        }
    }
    */


    //Dette er også delegering! Her delegerer vi oppgaven til arraylisten.
    //Alternativet er å manuelt legge inn Bordet i en liste. Da må vi ha index osv.
    public void add(Bord bord){
        bordene.add(bord);
    }


}
