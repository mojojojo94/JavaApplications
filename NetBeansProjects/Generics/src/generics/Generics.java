
package generics;

public class Generics {

    public static <T extends Comparable <T>> T findMax(T a, T b) {
        
        int n = a.compareTo(b);
        
        if (n < 0){
            return b;
        }
        else {
            return a;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(findMax(2,4));
        System.out.println(findMax(4,4));
        System.out.println(findMax(2,4));
        
        System.out.println(findMax("Abacus", "Bizarre"));
        System.out.println(findMax(4.12, 4.09));
        System.out.println(findMax('a', 'b'));
        
    }
    
}
