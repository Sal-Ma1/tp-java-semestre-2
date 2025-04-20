/**
 * @(#)ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/2/27
 */

public class ex1 {
        
    /**
     * Creates a new instance of <code>ex1</code>.
     */
    public ex1() {
    	
    	public class chaine {
    public static void main(String[] args) {
        String ch1 = "Coucou";
        String ch2 = new String(", c'est moi !\n");
        String ch3 = ch1 + ch2;
        System.out.println(ch3);
        System.out.println("longueur de ch1: " + ch1.length());
        System.out.println("caractere en position 2: " + ch1.charAt(2));
        System.out.println(ch1.equals("Coucou"));
        System.out.println(ch1.equals(ch2));
        System.out.println("position de o dans ch1? " + ch1.indexOf('o'));
        System.out.println("position de \"cou\" dans ch1? " + ch1.indexOf("cou"));
        System.out.println("position de \"moi\" dans ch1? " + ch1.indexOf("moi"));
        System.out.println("ch1 en majuscules: " + ch1.toUpperCase());
        System.out.println("ch1 en minuscules: " + ch1.toLowerCase());
    }
}
    }

