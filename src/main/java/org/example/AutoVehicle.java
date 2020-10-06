package org.example;

public class AutoVehicle extends Vehicle {

    private Engine engine;


    public AutoVehicle(Engine engine){
        this.engine=engine;
        //System.out.println("Custom constructor called");
    }

    public AutoVehicle(Engine engine, String name){
        this(engine);
        setName(name);
    }

    public AutoVehicle(){
        this(new Engine());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
