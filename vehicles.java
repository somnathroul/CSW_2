abstract class vehicle {
    int wheels;
    String type;
    public vehicle(int wheels, String type){
        this.wheels = wheels;
        this.type = type;
        System.out.println("vechile constructor is called");
    }
    public int  getWheels(){
        return wheels;
    }
    public abstract void startingline();
    public abstract void stoppingline();
}
class car extends vehicle{
    public car(int wheels,String type){
        super(wheels,type);
        System.out.println(type + "a constructor called");
    }
    public void startingline(){
        System.out.println(type + "Engine started");
    }
    public void stoppingline(){
        System.out.println(type + "Engine stoped");
    }
}   
class bike extends car{
    public bike(int wheels,String type) {
        super(wheels, type);
        System.out.println(type + "a constructor called");
    }
    public void enginetype(){
        System.out.println(type + "Motorbike Engine");
    }
    public void horn(){
        System.out.println(type + "Horn Blowing");
    }
    
}
public class vehicles{
    public static void  main(String[] args) {
        car mycar = new car(4,"Toyota");
        System.out.println("Type of the Vehicle : "+mycar.getWheels());
        System.out.println("Type of the Vehicle : "+mycar.type);
        mycar.startingline();
        mycar.stoppingline();
        
        bike mybike=new bike(2,"Honda");
        System.out.println("Type of the Bike : "+mybike );
        System.out.println("Type of Engines in Bike : ");
        mybike.enginetype();
        System.out.println("Sound from the Horn : ");
        mybike.horn();
    }
}
