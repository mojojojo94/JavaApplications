
package starwarsinterfacepractice;


public class Hero implements Character {
    
    public String weapon = "Green Lightsaber";
    
    public String getWeapon(){
        return weapon;
    }
    
    public Hero(){
        
    }
    
    public void attack(){
        System.out.println("The hero attacks enemy.");
    }
    
    public void heal(){
        System.out.println("The hero heals himself.");
    }
}
