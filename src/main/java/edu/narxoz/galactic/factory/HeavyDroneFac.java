package edu.narxoz.galactic.factory;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.HeavyDrone;

public class HeavyDroneFac implements DroneFac {

    @Override
    public Drone createDrone() {
        return new HeavyDrone("HD-1", 100);
    }
}
