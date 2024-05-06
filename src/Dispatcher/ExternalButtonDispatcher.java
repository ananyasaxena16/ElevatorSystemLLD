package Dispatcher;

import Controller.LiftController;
import Entities.Direction;
import Entities.LiftCreator;

import java.util.List;

public class ExternalButtonDispatcher {
    //make a list of lift controller and put 2 lifts in liftcreator class to keep it simple
    List<LiftController> elevatorControllerList = LiftCreator.liftControllerList;

    // odd/even strategy
    public void submitExternalRequest(int floor, Direction direction){
        for(LiftController lift : elevatorControllerList) {

            int elevatorID = lift.l.id;
            if (elevatorID%2==1 && floor%2==1){
                LiftController.submitExternalRequest(floor,direction);
            } else if(elevatorID%2==0 && floor%2==0){
                LiftController.submitExternalRequest(floor,direction);

            }
        }
    }


}
