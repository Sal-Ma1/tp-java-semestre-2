/**
 * @(#)Ex2.java
 *
 *
 * @author 
 * @version 1.00 2025/3/13
 */
import java.util.Scanner;
public class Ex2 {

    public static int lectureN() {
        Scanner scanner = new Scanner(System.in); 
        int n;
        do {
            System.out.print("Entrez un entier strictement positif: ");
            while (!scanner.hasNextInt()) { 
                System.out.println("Erreur: Veuillez entrer un entier valide.");
                scanner.next(); 
            }
            n = scanner.nextInt(); 
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit être strictement positif.");
            }
        } while (n <= 0); 
        return n; 
    }
    public static int compter(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++; 
        }
        return count; 
    }
    public static void main(String[] args) {
        int nombre = lectureN(); 
        int nombreChiffres = compter(nombre);
        System.out.println("Le nombre de chiffres de " + nombre + " est: " + nombreChiffres);
    }
}
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
