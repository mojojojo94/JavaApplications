
package arraysday7;

import java.io.*;
import java.util.*;

public class ArraysDay7 {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //System.out.println("What size array do you want?");
        
        int arraySize = in.nextInt();
        int[] arr = new int[arraySize];
        
        //System.out.print("Enter values for the array: ");
        for(int i = 0; i < arraySize; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        //System.out.println(arraySize);
        //System.out.println(Arrays.toString(arr));
        
        
        for(int i = arr.length - 1; i >= 0; i--){
            int revArray = arr[i];
            System.out.print(revArray);
            if(i < arr.length ){
                System.out.print(" ");
            }
        }
        
    }
    
}
