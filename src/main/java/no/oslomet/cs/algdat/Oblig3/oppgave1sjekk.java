package no.oslomet.cs.algdat.Oblig3;

import java.util.Comparator;

public class oppgave1sjekk {
    public static void main(String[] args) {
        int antallFeil = 0;
        SBinTre<Integer> tre =
                new SBinTre<>(Comparator.naturalOrder());

        try {
            if (tre.antall() != 0) {
                antallFeil++;
                System.out.println("Oppgave 1a: Feil antall i et tomt tre!");
            }
        } catch (Exception e) {
            antallFeil++;
            System.out.println
                    ("Oppgave 1b: Skal ikke kaste unntak for et tomt tre");
        }

        tre.leggInn(1);
        tre.leggInn(2);
        tre.leggInn(3);

        if (tre.antall() != 3) {
            antallFeil++;
            System.out.println
                    ("Oppgave 1c: Antall blir ikke oppdatert!");
        }

        System.out.println(antallFeil);
    }
}
