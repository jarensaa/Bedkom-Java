package IntroTilOOP.Synlighetsmodifikator;

import IntroTilOOP.Synlighetsmodifikator.mainpackage.Child;
import IntroTilOOP.Synlighetsmodifikator.mainpackage.Parent;
import IntroTilOOP.Synlighetsmodifikator.mainpackage.SamePackageClass;
import IntroTilOOP.Synlighetsmodifikator.secondpackage.ChildInOtherPackage;
import IntroTilOOP.Synlighetsmodifikator.secondpackage.OtherPackageClass;

/**
 * Målet til denne oppgaven er å skjenne hvordan synlighetsmodifikatorene beskytter variabler.
 *
 * I denne oppgaven har klassen 'Parent' en rekke variabler med forskjellig synelighetsmodifikatorer.
 * Klassene 'Child' og 'OtherPackageClass' prøver å få tilgang til disse.
 *
 * I hver klasse finnes det en toString metode. Denne prøver å returnere alle parent sine variabler, men som dere ser så
 * sliter de andre objektene med å gjøre dette.
 *
 * Oppgaven:
 * Svar på og diskuter sammen:  Hvodan påvirkes hver av dem av synlighetsmodifikatorene?
 *                              Hvordan fordeler har hver av synlighetsmodifikatoerene?
 *                              Bruksområder?
 *
 * Dersom vi har tid: Fiks toString i hver klasse og kjør programmet.
 */
public class main {
    public static void main(String[] args) {


        //Her instansierer vi klassene, resultatet er 5 forskjellige --objekter--.
        Parent parent = new Parent();
        Child child = new Child();
        OtherPackageClass otherPackage = new OtherPackageClass();
        SamePackageClass samePackage = new SamePackageClass();
        ChildInOtherPackage childInOtherPackage = new ChildInOtherPackage();

        System.out.println(
                        parent.toString() +
                        child.toString() +
                        otherPackage.toString() +
                        samePackage.toString() +
                        childInOtherPackage.toString()
        );
    }
}
