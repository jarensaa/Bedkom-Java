package IntroTilOOP.Synlighetsmodifikator.secondpackage;

import IntroTilOOP.Synlighetsmodifikator.mainpackage.Parent;

/**
 * Created by Jens-Andreas on 06-May-17.
 */
public class OtherPackageClass {

    Parent parent = new Parent();

    @Override
    public String toString() {
        return "To String for the OtherPackageClass class: \n" +
                " privateVariable = "   + parent.privateVariable   + "\n" +
                " defaultVariable = "   + parent.defaultVariable   + "\n" +
                " protectedVariable = " + parent.protectedVariable + "\n" +
                " publicVariable = "    + parent.publicVariable   + "\n \n";
    }
}
