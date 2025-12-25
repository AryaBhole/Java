public class Car {
    String colour;

    Car(String colour){
        this.colour = colour;
    }

    void drive(){
        System.out.println("We are driving a " + this.colour + " car");
    }
    @Override
    public String toString(){
        return "Banana " + this.colour;
    }
}