package Rooms;
import Game.Runner;
import People.Person;

public class LosingRoom extends Room {
    public LosingRoom(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the losing room! MWAH HAH HAH HAH HAH!!!! Minus 50 points for Gryffindor.");
        Runner.gameOff();
    }
}
