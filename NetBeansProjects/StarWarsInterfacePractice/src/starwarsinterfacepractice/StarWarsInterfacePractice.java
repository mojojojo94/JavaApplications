
package starwarsinterfacepractice;

import java.util.Random;


public class StarWarsInterfacePractice {

    
    public static Character summonCharacter() {
        
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0){
            return new Enemy();
        }
        else {
            return new Hero();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Enemy DarthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        
        DarthVader.weaponDraw();
        DarthVader.attack();
        ObiWanKenobi.attack();
        DarthVader.heal();
        ObiWanKenobi.heal();
        System.out.println("Enemy weapon: " + DarthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
    
}
