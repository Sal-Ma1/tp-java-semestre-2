/**
 * @(#)Application 5.java
 *
 *
 * @author
 * @version 1.00 2025/3/2
 */

public class Application 5 {
        
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne pour ins�rer des ast�risques : ");
        String toModify = scanner.nextLine();
        String withAsterisks = String.join("*", toModify.split(""));
        System.out.println("Cha�ne modifi�e : " + withAsterisks);
        scanner.close();
    }
}
