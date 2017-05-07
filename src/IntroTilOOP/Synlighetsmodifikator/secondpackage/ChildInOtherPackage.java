package IntroTilOOP.Synlighetsmodifikator.secondpackage;

import IntroTilOOP.Synlighetsmodifikator.mainpackage.Parent;

/**
 * Created by Jens-Andreas on 06-May-17.
 */
public class ChildInOtherPackage extends Parent{
    @Override
    public String toString() {
        return "To String for the ChildInOtherPackage class: \n" +
                " privateVariable = "   + super.privateVariable   + "\n" +
                " defaultVariable = "   + super.defaultVariable   + "\n" +
                " protectedVariable = " + super.protectedVariable + "\n" +
                " publicVariable = "    + super.publicVariable   + "\n \n";
    }
}
