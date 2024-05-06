package Controller;

import Entities.Direction;
import Entities.Lift;

import java.util.PriorityQueue;

public class LiftController {


    public Lift l;
    public Direction d;
    public static PriorityQueue<Integer> upMinPQ;
    public static PriorityQueue<Integer> downMaxPQ;

    public LiftController(Lift l)
    {
        this.l = l;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);

    }

    public static void submitExternalRequest(int floor, Direction direction) {
        if(direction==Direction.up)
        {
            upMinPQ.add(floor);
        }else{
            downMaxPQ.add(floor);
        }


    }
    public void submitInternalRequest(int floor){

    }



    //2 heaps 1 min heap and 1 max heap
    //1 queue to keep the leftover floors

    //constructor function

    //function to go to desired input floor from outside button




}
