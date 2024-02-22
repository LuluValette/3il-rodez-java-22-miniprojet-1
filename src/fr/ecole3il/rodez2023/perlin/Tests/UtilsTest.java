package fr.ecole3il.rodez2023.perlin.Tests;

import fr.ecole3il.rodez2023.perlin.Utils;

import java.util.Arrays;


class UtilsTest {
    public static void main(String[] args) {
        /**
         * Retourne le nombre le plus petit entre deux
         * @test
         * **/

        int nombreUn = 1;
        int nombreDeux = 2;
        int nombreTrois = 3;
        System.out.println("Test de la méthode min.\n");
        System.out.println("Le nombre le plus petit entre " + nombreUn + " et " + nombreDeux + " est " + Utils.min(nombreUn, nombreDeux));
        System.out.println("Le nombre le plus petit entre " + nombreTrois + " et " + nombreDeux + " est " + Utils.min(nombreTrois, nombreDeux));
        System.out.println("Le nombre le plus petit entre " + nombreUn + " et " + nombreTrois + " est " + Utils.min(nombreUn, nombreTrois)+"\n");

        /**
         * Retourne la liste 1,2,3,4,5,6 de façon aléatoire.
         * @test
         * **/
        System.out.println("Test de la méthode melanger.\n");
        int[] liste={1,2,3,4,5,6};
        long seed = 1234567890L;
        System.out.println("Première seed -> "+Arrays.toString(Utils.melanger(liste, seed)));
        long nouvelleSeed=9876423216584L;
        System.out.println("Première seed -> "+Arrays.toString(Utils.melanger(liste, nouvelleSeed)));
    }
}
