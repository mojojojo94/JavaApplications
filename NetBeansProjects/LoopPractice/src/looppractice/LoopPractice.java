
package looppractice;


public class LoopPractice {

    
    public static void whileLoop(){
        
        int x = 0;
        
        while(x < 5){
            System.out.println("The value of x is " + x);
            x++;
        }
    }
    
    public static void doWhileLoop(){
        
        int x = 0;
        do{
            System.out.println("The value of x is " + x);
            x++;
        }while (x < 10);
        
    }
    
    public static void forLoop(){
        
        for(int x = 0; x < 10; x++){
            //System.out.println("The value of x is " + x);
            for(int y = 0; y < 10; y++){
                System.out.println("(" + x + "," + y + ")");
            }
            
        }
        System.out.println("This is the end.");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        forLoop();
    }
    
}
