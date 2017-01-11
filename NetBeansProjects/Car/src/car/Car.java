package car;

/**
 *
 * @author sheheryar
 */
public class Car {
    
    int maxSpeed = 250;
    int minSpeed = 0;
    
    double weight = 5500;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Batmobile";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 30.4;
    
    int numOfPeopleInCar = 1;
    int maxNumOfPeopleInCar = 6;
    
    public void printVariables() {
        System.out.println("This is the maxSpeed: " + maxSpeed);
        System.out.println("This is the minSpeed: " + minSpeed);
        System.out.println("This is the weight: " + weight);
        System.out.println("Is the car on: " + isTheCarOn);
        System.out.println("Condition of car: " + condition);
        System.out.println("Name of car: " + nameOfCar);
        System.out.println("Number of people in car: " + numOfPeopleInCar);
        
    }
    
    public Car(int customMaxSpeed, double customWeight, String customCarName, boolean customIsTheCarOn){
        
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        nameOfCar = customCarName;
        isTheCarOn = customIsTheCarOn;
        
    }
    
    //Getters and Setters
    
    public int getMaxSpeed(){
        
        return this.maxSpeed;
        
    }
    
    public int getMinSpeed(){
        
        return this.minSpeed;
        
    }
    
    public double getWeight(){
        
        return this.weight;
        
    }
    
    public boolean getIsTheCarOn(){
        
        return this.isTheCarOn;
        
    }
    
    public void setMaxSpeed(int newMaxSpeed){
        
        this.maxSpeed = newMaxSpeed;
    }
    
    public void upgradeMaxSpeed(){
        
        setMaxSpeed(getMaxSpeed() + 25);
    }
    
    public void getIn(){
        
        if (numOfPeopleInCar < maxNumOfPeopleInCar){
            numOfPeopleInCar++;
        }
        else{
            System.out.println("The Car is full." + numOfPeopleInCar + " = " + maxNumOfPeopleInCar);
        }
    }
    
    public void getOut(){
        
        if (numOfPeopleInCar > 0){
            numOfPeopleInCar--;
        }
        else{
            System.out.println("Theres no one in the car... " + numOfPeopleInCar);
        }
    }
    
    public double howManyMilesTillOutofGas(){
        
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        
        return maxFuel * mpg;
    }
    
    public void upgradeMinSpeed(){
        
        minSpeed = maxSpeed -100;
        maxSpeed = maxSpeed + 50;
    }
    
    public void turnCarOn(){
        
        if(!isTheCarOn){
            isTheCarOn = true;
        }
    }
    
    public void turnCarOff(){
        
        if(isTheCarOn){
            isTheCarOn = false;
        }
    }
    
    public void carName(String carName){
        
        nameOfCar = carName;
        
    }
    
    public static void main(String[] args){
        
        Car batmanCar = new Car(500, 6000.345, "Tank" ,true);
        
        System.out.println("Batman's Car: ");
        
        batmanCar.printVariables();
        batmanCar.upgradeMinSpeed();
        batmanCar.getIn();
        System.out.print("\n");
        batmanCar.printVariables();
        batmanCar.turnCarOn();
        batmanCar.getOut();
        batmanCar.carName("Joker Car");
        System.out.print("\n");
        batmanCar.printVariables();
        
        Car batman1990car = new Car(200, 2000, "Roadster" ,true);
        System.out.print("\n");
        batman1990car.getIn();
        batman1990car.getIn();
        batman1990car.getIn();
        System.out.println("Miles Left: " + batman1990car.howManyMilesTillOutofGas());
        System.out.println("Max Miles: " + batman1990car.maxMilesPerFillUp());
        batman1990car.printVariables();
        
    }
}
