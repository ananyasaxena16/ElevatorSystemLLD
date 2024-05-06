package Entities;

import Dispatcher.ExternalButtonDispatcher;

public class Floor {
    private int floor;
    private ExternalButtonDispatcher externalButtonDispatcher;
    public Floor(int floor, ExternalButtonDispatcher externalButtonDispatcher)
    {
        this.floor=floor;
        this.externalButtonDispatcher=externalButtonDispatcher;

    }
    public void pressExternalButton(Direction direction)
    {
        externalButtonDispatcher.submitDispatchRequest(direction, floor);

    }
}
