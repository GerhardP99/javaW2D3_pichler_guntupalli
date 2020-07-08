package sinduri.InheritanceEx;

public class Car extends Vehicle {

    Boolean automaticCar;
    int numberSeats;

    public Car(String brandVehicle, String modelVehicle, int numberOfWheels, int maxSpeed, Boolean automaticCar, int numberSeats) {
        super(brandVehicle, modelVehicle, numberOfWheels, maxSpeed);
        this.automaticCar = automaticCar;
        this.numberSeats = numberSeats;

    }

    void display() {
        System.out.printf("Car Details:%n\t%s %s %s Car with %d wheels, %d kmph maximum speed and %d seats. ",
                ((this.automaticCar == true) ? "An automatic" : "A manual"),
                this.brandVehicle, this.modelVehicle, this.numberOfWheels, this.maxSpeed, this.numberSeats);
    }





}
