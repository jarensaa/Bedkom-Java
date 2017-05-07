package IntroTilOOP.Synlighetsmodifikator.mainpackage;

//her lager vi --klassen-- Parent. Dette er da ikke et objekt.
public class Child extends Parent{

    @Override
    public String toString() {
        return "To String for the Child class: \n" +
                " privateVariable = "   + privateVariable   + "\n" +
                " defaultVariable = "   + defaultVariable   + "\n" +
                " protectedVariable = " + protectedVariable + "\n" +
                " publicVariable = "    + publicVariable   + "\n \n";
    }
}


