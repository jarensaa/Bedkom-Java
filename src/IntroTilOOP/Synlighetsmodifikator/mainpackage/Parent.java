package IntroTilOOP.Synlighetsmodifikator.mainpackage;

/**
 * Created by Jens-Andreas on 06-May-17.
 */
public class Parent {
    private     boolean privateVariable = true;
    boolean             defaultVariable = true;
    protected   boolean protectedVariable = true;
    public      boolean publicVariable= true;

    @Override
    public String toString() {
        return "To String for the Parent class: \n" +
                " privateVariable = "   + privateVariable   + "\n" +
                " defaultVariable = "   + defaultVariable   + "\n" +
                " protectedVariable = " + protectedVariable + "\n" +
                " publicVariable = "    + publicVariable   + "\n \n";
    }
}
