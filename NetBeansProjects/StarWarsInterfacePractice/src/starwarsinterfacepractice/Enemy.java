
package starwarsinterfacepractice;


public class Enemy implements Character {
    
    public String weapon = "Red Lightsaber";
    
    public String getWeapon(){
        return weapon;
    }
    
    public Enemy(){
        
    }
    
    public void attack(){
        System.out.println("The enemy attacks you!");
    }
    
    public void heal(){
        System.out.println("The enemy heals himself.");
    }
    
    public void weaponDraw(){
        System.out.println("The enemy draws his weapon.");
    }
}
