
package animalinheritance;
/**
 *
 * @author sheheryar
 */
public abstract class Animal {
    
    private int age; //vs private int age;

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }
    
    public abstract void eat();
    
    public void sleep(){
        System.out.println("An animal is sleeping.");
    }
    
    public int getAge(){
        return age;
    }
    
    public static void main(String[] args) {
        
        Dog d = new Dog(2);
        Cat c = new Cat(1);
        
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();
        
        //Casting
        Object dog = new Dog(1);
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        Object str = "str";
        String realS = (String) str;
        realS.getBytes();
        
        //What happens when...
        Dog doggy = new Dog(3);
        if (d instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
        
        //What happens if...
        //Animal o = new Dog(10);
        //o.ruff(); A subclass can be generalized to a superclass 
        //but a superclass cannot become a more specific subclass.
    }
    
}
