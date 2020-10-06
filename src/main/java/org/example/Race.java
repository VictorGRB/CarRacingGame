package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Race {



    private List<Vehicle> competitors= new ArrayList<Vehicle>();

    private double trackLength;
    private double trackFuelLevel;
    private int competitorCount=2;

    public List<Vehicle> getCompetitors() {
        return competitors;
    }

    public String readVehicleName(){

        System.out.println("Enter Vehicle Name.");

        Scanner scanner =new Scanner(System.in);
        String vehicleName=scanner.nextLine();
        System.out.println("Your vehicle's name is "+vehicleName);

        return vehicleName;
    }
    public double readAccelerationSpeed() throws Exception {

        System.out.println("Enter Vehicle Acceleration speed.");
        double accelerationSpeed=0;
        Scanner scanner =new Scanner(System.in);
        try {
            accelerationSpeed= scanner.nextDouble();
        }
        catch (InputMismatchException exception){
            System.out.println("Please enter a valid number");
            return readAccelerationSpeed();
        }
        System.out.println("The Acceleration speed is "+accelerationSpeed+"km/h");

        return accelerationSpeed;
    }
    public void addCompetitor(){
        String name=readVehicleName();

        AutoVehicle autovehicle=new AutoVehicle();
        autovehicle.setName(name);

        double mileage= ThreadLocalRandom.current().nextDouble(8,11);

        autovehicle.setMileage(mileage);
        System.out.println("Mileage for Vehicle with name "+autovehicle.getName()+" is "+mileage+" 1/100 km/h");

        competitors.add(autovehicle);

    }
     public void addAllCompetitors(){
        for (int i=0;i<competitorCount;i++){
            addCompetitor();
        }
     }

     public Vehicle determineWinner() throws Exception {

        int noFuelCompetitors=0;


        while(noFuelCompetitors < competitorCount){
            for(Vehicle vehicle : competitors){
                double accelerationSpeed=readAccelerationSpeed();
                double travelDistance =vehicle.accelerate(accelerationSpeed);

                if (vehicle.getFuelLevel()<=0){
                    noFuelCompetitors++;
                }
                if (travelDistance >= trackLength){

                    System.out.println("The winner of the race is "+vehicle.getName());
                    return vehicle;
                }
            }

        }
        return null;

     }

     public void start() throws Exception {
        addAllCompetitors();
        determineWinner();
     }

    public void setTrackLength(double trackLength) {
        this.trackLength = trackLength;
    }

    public void setTrackFuelLevel(double trackFuelLevel) {
        this.trackFuelLevel = trackFuelLevel;
    }
}
