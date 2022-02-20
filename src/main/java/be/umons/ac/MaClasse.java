package be.umons.ac;

/**
 *
 * @author Jalal-Eddine Afrigh
 */
public class MaClasse {
    
     /**
     * Méthode qui prend un paramètre un tableau d'entier et 
     * calcule la somme des entiers du tableau.
     * @param a le tableau d'entiers.
     * @return la somme des valeurs contenues dans le tableau.
     */    
    public static int sommeTab(int [] a)
    {
        int somme = 0;
        for (int i=0; i < a.length; i++)
            somme = somme + a[i];
        return somme;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Result: " + MaClasse.sommeTab(new int [] {8+9+7}));
    }  
}
