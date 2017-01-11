
package animalinheritance;

/**
 *
 * @author sheheryar
 */
public class Cat extends Animal {
    
    public Cat(int age){
        
        super(age);
        System.out.println("A cat has been created");
    }
    
    public void eat(){
        System.out.println("A cat is eating.");
    }
    
    //public abstract eat();
    
    public void sleep(){
        System.out.println("A cat is sleeping.");
    }
    
    public void meow(){
        System.out.println("A cat meows!");
    }
    
    public void prance(){
        System.out.println("A cat is prancing.");
    }
    
}
