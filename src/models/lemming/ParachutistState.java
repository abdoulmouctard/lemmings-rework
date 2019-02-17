package models.lemming;

public class ParachutistState extends State
{
    private int steps = 5;

    @Override
    public void action()
    {
        if (this.lemming.falling()) this.lemming.updateState();

    }
}
