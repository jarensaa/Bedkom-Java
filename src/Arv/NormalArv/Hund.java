package Arv.NormalArv;

/**
 * Created by Jens-Andreas on 07-May-17.
 */
public class Hund {

    private String navn;
    private String rase;

    public Hund(String navn, String rase){
        this.navn = navn;
        this.rase = rase;
    }

    public String getRase() {
        return rase;
    }

    public String getNavn() {
        return navn;
    }


}
