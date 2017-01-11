
package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayPractice {
    
    public static void printIntArray(int[] array){
        
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            int item = array[i];
            System.out.print(item);
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void printStringArray(String[] array){
        
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            String item = array[i];
            System.out.print(item);
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring
        int[] intArray1;
        //Allocating
        int[] intArray2 = new int[4];
        printIntArray(intArray2);
        //Initializing
        int[] intArray3 = {4, 2, 1, 5, 6};
        
        String[] shoppingList = {"Cilantro", "Avocado", "Lime", "Onion", 
            "Tomato", "Salt", "Pepper" };
        
        intArray2[0] = 10;
        intArray2[1] = 11;
        intArray2[2] = 2;
        intArray2[3] = 3;
        
        //If you want to get random objects from an Array
        //Math.abs(rand.nextInt()) % length;
        
        
        
        //Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        //Custom Print Out Arrays
        printIntArray(intArray2);
        printIntArray(intArray3);
        System.out.println();
        
        //Retrieve Objects
        System.out.println(intArray2[1]);
        System.out.println(Array.get(intArray2, 1));
        System.out.println();
        
        //Given Functions
        Arrays.sort(intArray3);
        printIntArray(intArray3);
        System.out.println();
        
        //Print String Array
        printStringArray(shoppingList);
        System.out.println();
        
        System.out.println("Special for loop: for each");
        //Special for loop: for each
        for(String s: shoppingList){
            System.out.println(s);
        }
        
        
    }
    
}
