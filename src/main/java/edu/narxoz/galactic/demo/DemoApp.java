package edu.narxoz.galactic.demo;

import edu.narxoz.galactic.bodies.Planet;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.dispatcher.Dispatcher;
import edu.narxoz.galactic.dispatcher.Result;
import edu.narxoz.galactic.drones.DroneStatus;
import edu.narxoz.galactic.drones.HeavyDrone;
import edu.narxoz.galactic.drones.LightDrone;
import edu.narxoz.galactic.task.DeliveryTask;
import edu.narxoz.galactic.task.TaskState;

public class DemoApp {

    public static void main(String[] args) {

        Planet earth = new Planet("Earth", 0, 0, "good for living");
        Planet mars = new Planet("Mars", 300, 400, "high CO2");

        Cargo heavyCargo = new Cargo(50, "Heavy");

        LightDrone lightDrone = new LightDrone("1", 20);
        HeavyDrone heavyDrone = new HeavyDrone("1", 100);

        DeliveryTask task = new DeliveryTask(earth, mars, heavyCargo);
        Dispatcher dispatcher = new Dispatcher();

        System.out.println("1. failure to assign overweight cargo to LightDrone");
        Result r1 = dispatcher.assignTask(task, lightDrone);
        System.out.println("Result: ok=" + r1.ok() + ", reason=" + r1.reason());
        System.out.println();

        System.out.println("2. success with HeavyDrone");
        Result r2 = dispatcher.assignTask(task, heavyDrone);
        System.out.println("Result: ok=" + r2.ok());
        System.out.println();

        double time = task.estimateTime();
        System.out.println("3. Estimated time: " + time + " minutes");
        System.out.println();

        System.out.println("4. Complete task");
        Result r3 = dispatcher.completeTask(task);
        System.out.println("Completion result: ok=" + r3.ok());

        System.out.println("Final drone status: " + heavyDrone.getStatus());
        System.out.println("Final task state: " + task.getState());
    }
}

