package Java8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Streams er forresten prosedyreorientert programmering, så vi holder oss til én klasse.
 *
 * Oppagaven: Gjør alt som står i main metoden med streams og lambda utrykk.
 */
public class Streams {
    public static void main(String[] args) {

        ArrayList<Integer> templateNumbers = new ArrayList<>(Arrays.asList(4,6,1,9,2,8,4,2,7,2));
        ArrayList<Integer> numbers = templateNumbers;


        numbers = templateNumbers;
        //gang alle tallene med 10 og fjern alle som blir under 2



        numbers = templateNumbers;
        //Sorter tallene. (Fortsatt med streams, ikke Collections.sort


        numbers = templateNumbers;
        //Sjekk om tallet 8 finnes i lista.



        numbers = templateNumbers;
        //Finn summen av tallene i lista


    }
}
