/**
 * @(#)ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/2/27
 */

public class ex1 {
        
    
    public static void main(String[] args) {
        
        
     import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Nom de variable corrigé
        System.out.println("Entrez une chaîne :");
        String chaine = scanner.nextLine();

        if (chaine.length() > 0) {
            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caractère : " + premierCaractere);
            System.out.println("Dernier caractère : " + dernierCaractere);
        } else {
            System.out.println("La chaîne est vide.");
        }

        System.out.println("Chaîne en majuscules : " + chaine.toUpperCase());
        scanner.close();
    }
}
/**
 * @(#)Ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/3/13
 */

public class Ex1 {
	public static int lectureN(){
		int n;
		do{
			System.out.print(s:"Entrez un entier strictement positif:");
			while (!scanner.hasNextInt()) {
				System.out.println(x:"Erreur:Veuillez entrer un entier validé.");
				scanner.next();}
				n=scanner.nextInt();
				if (n<=0){
					System.out.println(x:"Erreur:l'entier doit etre strictement positif.");
				}
		}while(n<=0);
		return n;
	}
        
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
