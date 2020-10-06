package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

/*


        Engine daciaEngine= new Engine();
        daciaEngine.setManufacturer("Renault");

        RadioControlledCar dacia=new RadioControlledCar(daciaEngine);

        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);

        Engine ladaEngine= new Engine();
        ladaEngine.setManufacturer("Lada");

        RadioControlledCar lada =new RadioControlledCar(ladaEngine);
        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        Vehicle motorcycle =new RadioControlledMotorcycle(new Engine());

        motorcycle.accelerate(10);

        Race race = new Race();

        race.getCompetitors().add(dacia);
        race.getCompetitors().add(lada);




        for(Vehicle vehicle : race.getCompetitors()){

            if (vehicle !=null){
                System.out.println(vehicle.getName());
            }
        }

        race.readVehicleName();
        race.readAccelerationSpeed();

*/

        Race race=new Race();

        race.setTrackLength(200);
        race.setTrackFuelLevel(50);
        race.start();


    }
}
