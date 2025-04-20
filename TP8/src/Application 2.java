/**
 * @(#)Application 2.java
 *
 *
 * @author
 * @version 1.00 2025/3/2
 */

public class Application 2 {
        
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();
        String firstWord = phrase.split(" ")[0];
        System.out.println("Le premier mot est : " + firstWord);
        scanner.close();
    }
}
