package Entities;

import Controller.LiftController;

import java.util.ArrayList;
import java.util.List;

public class LiftCreator {
    public static List<LiftController> liftControllerList = new ArrayList<>();
    static {

        Lift lift1 = new Lift();
        lift1.id =1;
        LiftController controller1 = new LiftController(lift1);

        Lift lift2 = new Lift();
        lift2.id =1;
        LiftController controller2 = new LiftController(lift2);


        liftControllerList.add(controller1);
        liftControllerList.add(controller2);
    }

}
