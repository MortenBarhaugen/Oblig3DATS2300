package no.oslomet.cs.algdat.Oblig3;

import java.util.Comparator;

public class Oppgave2sjekk {
    public static void main(String[] args) {
        /*Integer[] a = {4,7,2,9,4,10,8,7,4,6};
        SBinTre<Integer> tre = new SBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) { tre.leggInn(verdi); }*/
        //test

        Integer[] b = {4,3,2,1};
        SBinTre<Integer> tre2 = new SBinTre<>(Comparator.naturalOrder());
        for (int verdi : b) { tre2.leggInn(verdi); }

        System.out.println(tre2.antall());      // Utskrift: 10
        System.out.println(tre2.antall(5));     // Utskrift: 0
        System.out.println(tre2.antall(4));     // Utskrift: 3
        System.out.println(tre2.antall(7));     // Utskrift: 2
        System.out.println(tre2.antall(10));    // Utskrift: 1
    }
}
