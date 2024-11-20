public class Q5 {
    public static void main(String[] args) {
            // Conversion du paramètre en entier
            int n = Integer.parseInt(args[0]);
      
            // Affichage du triangle d'étoiles
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) 
                    System.out.print("*");
            
                System.out.println(); // Passage à la ligne suivante
            }
    }
}
