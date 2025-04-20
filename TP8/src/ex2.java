/**
 * @(#)ex2.java
 *
 *
 * @author 
 * @version 1.00 2025/2/27
 */

public class ex2 {
        
    /**
     * Creates a new instance of <code>ex2</code>.
     */
    public ex2() {
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chai^ne de caracte`res : ");
        String chaine = scanner.nextLine();

        if (chaine != null && !chaine.isEmpty()) {

            System.out.print("Un caracte`re sur deux : ");
            for (int i = 0; i < chaine.length(); i += 2) {
                System.out.print(chaine.charAt(i));
            }
            System.out.println(); 

            char premierCaractere = chaine.charAt(0);
            char dernierCaractere = chaine.charAt(chaine.length() - 1);
            System.out.println("Premier caracte`re : " + premierCaractere);
            System.out.println("Dernier caracte`re : " + dernierCaractere);
        } else {
            System.out.println("La chai^ne est vide. Veuillez saisir une chai^ne valide.");
        }
    }
}
      

