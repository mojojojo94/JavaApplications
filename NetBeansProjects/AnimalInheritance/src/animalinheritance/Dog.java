
package animalinheritance;

/**
 *
 * @author sheheryar
 */
public class Dog extends Animal {
    
    public Dog(int age){
        
        super(age);
        System.out.println("A dog has been created!");
    }
    
    public void eat(){
        System.out.println("A dog is eating.");
    }
    
    //public abstract eat();
    
    public void sleep(){
        System.out.println("A dog is sleeping.");
    }
    
    public void ruff(){
        System.out.println("The dog says ruff!");
    }
    
    public void run(){
        System.out.println("A dog is running.");
    }
}
