package models.map;

public class Location
{
    private int x;
    private int y;

    private static final int SCALE = 1;

    public Location(int x, int y) { this.x = x; this.y = y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }

    public void incrementX() { this.x += SCALE; }
    public void incrementY() { this.x += SCALE; }

    public void decrementX() { this.x -= SCALE; }
    public void decrementY() { this.y -= SCALE; }


    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Location)) return false;

        Location location = (Location) object;
        return this.x == location.x && this.y == location.y;
    }

    @Override
    public String toString() { return "Location: (x,y) => ("+ this.x +","+this.y+")"; }
}
