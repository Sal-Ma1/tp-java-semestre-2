/**
 * @(#)exercice1.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */

public class exercice1 {

    public static int lectureN() {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = Clavier.lireInt();
        } while (n <= 0);
        return n;
    }

    public static int Compter(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = lectureN();
        int x = Compter(n);
        System.out.println("Le nombre contient " + x + " chiffre(s).");
    }
}
