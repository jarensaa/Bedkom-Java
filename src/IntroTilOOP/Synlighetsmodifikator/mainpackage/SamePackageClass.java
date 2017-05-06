package IntroTilOOP.Synlighetsmodifikator.mainpackage;

/**
 * Created by Jens-Andreas on 06-May-17.
 */
public class SamePackageClass {

    Parent parent = new Parent();

    @Override
    public String toString() {
        return "To String for the SamePackageClass class: \n" +
                " privateVariable = "   + parent.privateVariable   + "\n" +
                " defaultVariable = "   + parent.defaultVariable   + "\n" +
                " protectedVariable = " + parent.protectedVariable + "\n" +
                " publicVariable = "    + parent.publicVariable   + "\n \n";
    }
}
