package edu.narxoz.galactic.factory;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.LightDrone;

public class LightDroneFac implements DroneFac{


    @Override
    public Drone createDrone() {
        return new LightDrone("LD-1", 20);
    }
}
