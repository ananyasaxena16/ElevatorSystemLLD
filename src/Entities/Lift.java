package Entities;

public class Lift {
    public  int id;
    protected  Display display;
    protected Direction direction;
    protected Status status;
    protected int currentFloor;
    public Lift(int id, int currentFloor, Direction dir)
    {
        this.id=id;
        this.currentFloor=currentFloor;
        display=new Display();
        this.direction=dir;
        status=new Status(false);
    }


    public Lift() {

    }
}
