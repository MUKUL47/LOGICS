/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author admin
 */
public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car(true,"jaguar");
        c.CurrentVelocity(23);
        c.getSpeed();
        c.CurrentVelocity(23);
        c.getSpeed();
        c.CurrentVelocity(-223);
        c.getSpeed();
    }
}
class Vehicle{
    private int speed;
    private int gearNo;
    private String name;

    public Vehicle(String name) {
        
        this.gearNo = gearNo;
        this.name = name;
    }
   void CurrentVelocity(int speed){
       this.speed=this.speed+speed;
       ChangedGear(this.speed);
    } 
  void ChangedGear( int speed){
      if(speed>0 && speed<=20){
          this.gearNo=1;
          System.out.println("Gear changed to : "+this.gearNo);
      }
      else if(speed>20 && speed<=40){
          this.gearNo=2;
          System.out.println("Gear changed to : "+this.gearNo);
      }
      else if(speed>40 && speed<=60){
          this.gearNo=3;
          System.out.println("Gear changed to : "+this.gearNo);
      }
      else{
          this.gearNo=0;
          this.speed=0;
          System.out.println("Car stopped at gear : "+this.gearNo);
          
      }
      
       
    }

    public void getSpeed() {
        System.out.println("Current speed of "+getName()+"is "+this.speed);
    }


    public String getName() {
        return name;
    }
    
    
}
class Car extends Vehicle{
    private boolean steeringHand;


    public Car(boolean steeringHand, String name) {
        super( name);
        this.steeringHand = steeringHand;
    }

    void steeringtype(boolean type){
        if(type==false){
            System.out.println("No");
        }else
            System.out.println("Yes");
    }

    @Override
    public void getSpeed() {
        super.getSpeed(); //To change body of generated methods, choose Tools | Templates.
    }

   
  
 
  
}
